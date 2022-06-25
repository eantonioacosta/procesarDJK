/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.datos;

import djk.procesardkj.datos.exceptions.NonexistentEntityException;
import djk.procesardkj.datos.exceptions.PreexistingEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import djk.procesardkj.domain.Area;
import djk.procesardkj.domain.Asignatura;
import djk.procesardkj.domain.CargaAcademica;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ENOR ACOSTA
 */
public class AsignaturaJpaController implements Serializable {

    public AsignaturaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public AsignaturaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Asignatura asignatura) throws PreexistingEntityException, Exception {
        if (asignatura.getCargaAcademicaList() == null) {
            asignatura.setCargaAcademicaList(new ArrayList<CargaAcademica>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Area area = asignatura.getArea();
            if (area != null) {
                area = em.getReference(area.getClass(), area.getIdArea());
                asignatura.setArea(area);
            }
            List<CargaAcademica> attachedCargaAcademicaList = new ArrayList<CargaAcademica>();
            for (CargaAcademica cargaAcademicaListCargaAcademicaToAttach : asignatura.getCargaAcademicaList()) {
                cargaAcademicaListCargaAcademicaToAttach = em.getReference(cargaAcademicaListCargaAcademicaToAttach.getClass(), cargaAcademicaListCargaAcademicaToAttach.getIdCarga());
                attachedCargaAcademicaList.add(cargaAcademicaListCargaAcademicaToAttach);
            }
            asignatura.setCargaAcademicaList(attachedCargaAcademicaList);
            em.persist(asignatura);
            if (area != null) {
                area.getAsignaturaList().add(asignatura);
                area = em.merge(area);
            }
            for (CargaAcademica cargaAcademicaListCargaAcademica : asignatura.getCargaAcademicaList()) {
                Asignatura oldAsignaturaOfCargaAcademicaListCargaAcademica = cargaAcademicaListCargaAcademica.getAsignatura();
                cargaAcademicaListCargaAcademica.setAsignatura(asignatura);
                cargaAcademicaListCargaAcademica = em.merge(cargaAcademicaListCargaAcademica);
                if (oldAsignaturaOfCargaAcademicaListCargaAcademica != null) {
                    oldAsignaturaOfCargaAcademicaListCargaAcademica.getCargaAcademicaList().remove(cargaAcademicaListCargaAcademica);
                    oldAsignaturaOfCargaAcademicaListCargaAcademica = em.merge(oldAsignaturaOfCargaAcademicaListCargaAcademica);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findAsignatura(asignatura.getIdAsignatura()) != null) {
                throw new PreexistingEntityException("Asignatura " + asignatura + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Asignatura asignatura) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Asignatura persistentAsignatura = em.find(Asignatura.class, asignatura.getIdAsignatura());
            Area areaOld = persistentAsignatura.getArea();
            Area areaNew = asignatura.getArea();
            List<CargaAcademica> cargaAcademicaListOld = persistentAsignatura.getCargaAcademicaList();
            List<CargaAcademica> cargaAcademicaListNew = asignatura.getCargaAcademicaList();
            if (areaNew != null) {
                areaNew = em.getReference(areaNew.getClass(), areaNew.getIdArea());
                asignatura.setArea(areaNew);
            }
            List<CargaAcademica> attachedCargaAcademicaListNew = new ArrayList<CargaAcademica>();
            for (CargaAcademica cargaAcademicaListNewCargaAcademicaToAttach : cargaAcademicaListNew) {
                cargaAcademicaListNewCargaAcademicaToAttach = em.getReference(cargaAcademicaListNewCargaAcademicaToAttach.getClass(), cargaAcademicaListNewCargaAcademicaToAttach.getIdCarga());
                attachedCargaAcademicaListNew.add(cargaAcademicaListNewCargaAcademicaToAttach);
            }
            cargaAcademicaListNew = attachedCargaAcademicaListNew;
            asignatura.setCargaAcademicaList(cargaAcademicaListNew);
            asignatura = em.merge(asignatura);
            if (areaOld != null && !areaOld.equals(areaNew)) {
                areaOld.getAsignaturaList().remove(asignatura);
                areaOld = em.merge(areaOld);
            }
            if (areaNew != null && !areaNew.equals(areaOld)) {
                areaNew.getAsignaturaList().add(asignatura);
                areaNew = em.merge(areaNew);
            }
            for (CargaAcademica cargaAcademicaListOldCargaAcademica : cargaAcademicaListOld) {
                if (!cargaAcademicaListNew.contains(cargaAcademicaListOldCargaAcademica)) {
                    cargaAcademicaListOldCargaAcademica.setAsignatura(null);
                    cargaAcademicaListOldCargaAcademica = em.merge(cargaAcademicaListOldCargaAcademica);
                }
            }
            for (CargaAcademica cargaAcademicaListNewCargaAcademica : cargaAcademicaListNew) {
                if (!cargaAcademicaListOld.contains(cargaAcademicaListNewCargaAcademica)) {
                    Asignatura oldAsignaturaOfCargaAcademicaListNewCargaAcademica = cargaAcademicaListNewCargaAcademica.getAsignatura();
                    cargaAcademicaListNewCargaAcademica.setAsignatura(asignatura);
                    cargaAcademicaListNewCargaAcademica = em.merge(cargaAcademicaListNewCargaAcademica);
                    if (oldAsignaturaOfCargaAcademicaListNewCargaAcademica != null && !oldAsignaturaOfCargaAcademicaListNewCargaAcademica.equals(asignatura)) {
                        oldAsignaturaOfCargaAcademicaListNewCargaAcademica.getCargaAcademicaList().remove(cargaAcademicaListNewCargaAcademica);
                        oldAsignaturaOfCargaAcademicaListNewCargaAcademica = em.merge(oldAsignaturaOfCargaAcademicaListNewCargaAcademica);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = asignatura.getIdAsignatura();
                if (findAsignatura(id) == null) {
                    throw new NonexistentEntityException("The asignatura with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Asignatura asignatura;
            try {
                asignatura = em.getReference(Asignatura.class, id);
                asignatura.getIdAsignatura();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The asignatura with id " + id + " no longer exists.", enfe);
            }
            Area area = asignatura.getArea();
            if (area != null) {
                area.getAsignaturaList().remove(asignatura);
                area = em.merge(area);
            }
            List<CargaAcademica> cargaAcademicaList = asignatura.getCargaAcademicaList();
            for (CargaAcademica cargaAcademicaListCargaAcademica : cargaAcademicaList) {
                cargaAcademicaListCargaAcademica.setAsignatura(null);
                cargaAcademicaListCargaAcademica = em.merge(cargaAcademicaListCargaAcademica);
            }
            em.remove(asignatura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Asignatura> findAsignaturaEntities() {
        return findAsignaturaEntities(true, -1, -1);
    }

    public List<Asignatura> findAsignaturaEntities(int maxResults, int firstResult) {
        return findAsignaturaEntities(false, maxResults, firstResult);
    }

    private List<Asignatura> findAsignaturaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Asignatura.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Asignatura findAsignatura(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Asignatura.class, id);
        } finally {
            em.close();
        }
    }

    public int getAsignaturaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Asignatura> rt = cq.from(Asignatura.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
