/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.datos;

import djk.procesardkj.datos.exceptions.NonexistentEntityException;
import djk.procesardkj.domain.AnioLectivo;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import djk.procesardkj.domain.Grupo;
import java.util.ArrayList;
import java.util.List;
import djk.procesardkj.domain.CargaAcademica;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ENOR ACOSTA
 */
public class AnioLectivoJpaController implements Serializable {

    public AnioLectivoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public AnioLectivoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(AnioLectivo anioLectivo) {
        if (anioLectivo.getGrupoList() == null) {
            anioLectivo.setGrupoList(new ArrayList<Grupo>());
        }
        if (anioLectivo.getCargaAcademicaList() == null) {
            anioLectivo.setCargaAcademicaList(new ArrayList<CargaAcademica>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Grupo> attachedGrupoList = new ArrayList<Grupo>();
            for (Grupo grupoListGrupoToAttach : anioLectivo.getGrupoList()) {
                grupoListGrupoToAttach = em.getReference(grupoListGrupoToAttach.getClass(), grupoListGrupoToAttach.getIdGrupo());
                attachedGrupoList.add(grupoListGrupoToAttach);
            }
            anioLectivo.setGrupoList(attachedGrupoList);
            List<CargaAcademica> attachedCargaAcademicaList = new ArrayList<CargaAcademica>();
            for (CargaAcademica cargaAcademicaListCargaAcademicaToAttach : anioLectivo.getCargaAcademicaList()) {
                cargaAcademicaListCargaAcademicaToAttach = em.getReference(cargaAcademicaListCargaAcademicaToAttach.getClass(), cargaAcademicaListCargaAcademicaToAttach.getIdCarga());
                attachedCargaAcademicaList.add(cargaAcademicaListCargaAcademicaToAttach);
            }
            anioLectivo.setCargaAcademicaList(attachedCargaAcademicaList);
            em.persist(anioLectivo);
            for (Grupo grupoListGrupo : anioLectivo.getGrupoList()) {
                AnioLectivo oldAnioLectivoOfGrupoListGrupo = grupoListGrupo.getAnioLectivo();
                grupoListGrupo.setAnioLectivo(anioLectivo);
                grupoListGrupo = em.merge(grupoListGrupo);
                if (oldAnioLectivoOfGrupoListGrupo != null) {
                    oldAnioLectivoOfGrupoListGrupo.getGrupoList().remove(grupoListGrupo);
                    oldAnioLectivoOfGrupoListGrupo = em.merge(oldAnioLectivoOfGrupoListGrupo);
                }
            }
            for (CargaAcademica cargaAcademicaListCargaAcademica : anioLectivo.getCargaAcademicaList()) {
                AnioLectivo oldAnioLectivoOfCargaAcademicaListCargaAcademica = cargaAcademicaListCargaAcademica.getAnioLectivo();
                cargaAcademicaListCargaAcademica.setAnioLectivo(anioLectivo);
                cargaAcademicaListCargaAcademica = em.merge(cargaAcademicaListCargaAcademica);
                if (oldAnioLectivoOfCargaAcademicaListCargaAcademica != null) {
                    oldAnioLectivoOfCargaAcademicaListCargaAcademica.getCargaAcademicaList().remove(cargaAcademicaListCargaAcademica);
                    oldAnioLectivoOfCargaAcademicaListCargaAcademica = em.merge(oldAnioLectivoOfCargaAcademicaListCargaAcademica);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(AnioLectivo anioLectivo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            AnioLectivo persistentAnioLectivo = em.find(AnioLectivo.class, anioLectivo.getIdAnioLectivo());
            List<Grupo> grupoListOld = persistentAnioLectivo.getGrupoList();
            List<Grupo> grupoListNew = anioLectivo.getGrupoList();
            List<CargaAcademica> cargaAcademicaListOld = persistentAnioLectivo.getCargaAcademicaList();
            List<CargaAcademica> cargaAcademicaListNew = anioLectivo.getCargaAcademicaList();
            List<Grupo> attachedGrupoListNew = new ArrayList<Grupo>();
            for (Grupo grupoListNewGrupoToAttach : grupoListNew) {
                grupoListNewGrupoToAttach = em.getReference(grupoListNewGrupoToAttach.getClass(), grupoListNewGrupoToAttach.getIdGrupo());
                attachedGrupoListNew.add(grupoListNewGrupoToAttach);
            }
            grupoListNew = attachedGrupoListNew;
            anioLectivo.setGrupoList(grupoListNew);
            List<CargaAcademica> attachedCargaAcademicaListNew = new ArrayList<CargaAcademica>();
            for (CargaAcademica cargaAcademicaListNewCargaAcademicaToAttach : cargaAcademicaListNew) {
                cargaAcademicaListNewCargaAcademicaToAttach = em.getReference(cargaAcademicaListNewCargaAcademicaToAttach.getClass(), cargaAcademicaListNewCargaAcademicaToAttach.getIdCarga());
                attachedCargaAcademicaListNew.add(cargaAcademicaListNewCargaAcademicaToAttach);
            }
            cargaAcademicaListNew = attachedCargaAcademicaListNew;
            anioLectivo.setCargaAcademicaList(cargaAcademicaListNew);
            anioLectivo = em.merge(anioLectivo);
            for (Grupo grupoListOldGrupo : grupoListOld) {
                if (!grupoListNew.contains(grupoListOldGrupo)) {
                    grupoListOldGrupo.setAnioLectivo(null);
                    grupoListOldGrupo = em.merge(grupoListOldGrupo);
                }
            }
            for (Grupo grupoListNewGrupo : grupoListNew) {
                if (!grupoListOld.contains(grupoListNewGrupo)) {
                    AnioLectivo oldAnioLectivoOfGrupoListNewGrupo = grupoListNewGrupo.getAnioLectivo();
                    grupoListNewGrupo.setAnioLectivo(anioLectivo);
                    grupoListNewGrupo = em.merge(grupoListNewGrupo);
                    if (oldAnioLectivoOfGrupoListNewGrupo != null && !oldAnioLectivoOfGrupoListNewGrupo.equals(anioLectivo)) {
                        oldAnioLectivoOfGrupoListNewGrupo.getGrupoList().remove(grupoListNewGrupo);
                        oldAnioLectivoOfGrupoListNewGrupo = em.merge(oldAnioLectivoOfGrupoListNewGrupo);
                    }
                }
            }
            for (CargaAcademica cargaAcademicaListOldCargaAcademica : cargaAcademicaListOld) {
                if (!cargaAcademicaListNew.contains(cargaAcademicaListOldCargaAcademica)) {
                    cargaAcademicaListOldCargaAcademica.setAnioLectivo(null);
                    cargaAcademicaListOldCargaAcademica = em.merge(cargaAcademicaListOldCargaAcademica);
                }
            }
            for (CargaAcademica cargaAcademicaListNewCargaAcademica : cargaAcademicaListNew) {
                if (!cargaAcademicaListOld.contains(cargaAcademicaListNewCargaAcademica)) {
                    AnioLectivo oldAnioLectivoOfCargaAcademicaListNewCargaAcademica = cargaAcademicaListNewCargaAcademica.getAnioLectivo();
                    cargaAcademicaListNewCargaAcademica.setAnioLectivo(anioLectivo);
                    cargaAcademicaListNewCargaAcademica = em.merge(cargaAcademicaListNewCargaAcademica);
                    if (oldAnioLectivoOfCargaAcademicaListNewCargaAcademica != null && !oldAnioLectivoOfCargaAcademicaListNewCargaAcademica.equals(anioLectivo)) {
                        oldAnioLectivoOfCargaAcademicaListNewCargaAcademica.getCargaAcademicaList().remove(cargaAcademicaListNewCargaAcademica);
                        oldAnioLectivoOfCargaAcademicaListNewCargaAcademica = em.merge(oldAnioLectivoOfCargaAcademicaListNewCargaAcademica);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = anioLectivo.getIdAnioLectivo();
                if (findAnioLectivo(id) == null) {
                    throw new NonexistentEntityException("The anioLectivo with id " + id + " no longer exists.");
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
            AnioLectivo anioLectivo;
            try {
                anioLectivo = em.getReference(AnioLectivo.class, id);
                anioLectivo.getIdAnioLectivo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The anioLectivo with id " + id + " no longer exists.", enfe);
            }
            List<Grupo> grupoList = anioLectivo.getGrupoList();
            for (Grupo grupoListGrupo : grupoList) {
                grupoListGrupo.setAnioLectivo(null);
                grupoListGrupo = em.merge(grupoListGrupo);
            }
            List<CargaAcademica> cargaAcademicaList = anioLectivo.getCargaAcademicaList();
            for (CargaAcademica cargaAcademicaListCargaAcademica : cargaAcademicaList) {
                cargaAcademicaListCargaAcademica.setAnioLectivo(null);
                cargaAcademicaListCargaAcademica = em.merge(cargaAcademicaListCargaAcademica);
            }
            em.remove(anioLectivo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<AnioLectivo> findAnioLectivoEntities() {
        return findAnioLectivoEntities(true, -1, -1);
    }

    public List<AnioLectivo> findAnioLectivoEntities(int maxResults, int firstResult) {
        return findAnioLectivoEntities(false, maxResults, firstResult);
    }

    private List<AnioLectivo> findAnioLectivoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(AnioLectivo.class));
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

    public AnioLectivo findAnioLectivo(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(AnioLectivo.class, id);
        } finally {
            em.close();
        }
    }

    public int getAnioLectivoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<AnioLectivo> rt = cq.from(AnioLectivo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
