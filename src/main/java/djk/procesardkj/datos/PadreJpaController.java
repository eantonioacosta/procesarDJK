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
import djk.procesardkj.domain.Estudiante;
import djk.procesardkj.domain.Padre;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ENOR ACOSTA
 */
public class PadreJpaController implements Serializable {

    public PadreJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public PadreJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Padre padre) throws PreexistingEntityException, Exception {
        if (padre.getEstudianteList() == null) {
            padre.setEstudianteList(new ArrayList<Estudiante>());
        }
        if (padre.getEstudianteList1() == null) {
            padre.setEstudianteList1(new ArrayList<Estudiante>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Estudiante> attachedEstudianteList = new ArrayList<Estudiante>();
            for (Estudiante estudianteListEstudianteToAttach : padre.getEstudianteList()) {
                estudianteListEstudianteToAttach = em.getReference(estudianteListEstudianteToAttach.getClass(), estudianteListEstudianteToAttach.getIdEstudiante());
                attachedEstudianteList.add(estudianteListEstudianteToAttach);
            }
            padre.setEstudianteList(attachedEstudianteList);
            List<Estudiante> attachedEstudianteList1 = new ArrayList<Estudiante>();
            for (Estudiante estudianteList1EstudianteToAttach : padre.getEstudianteList1()) {
                estudianteList1EstudianteToAttach = em.getReference(estudianteList1EstudianteToAttach.getClass(), estudianteList1EstudianteToAttach.getIdEstudiante());
                attachedEstudianteList1.add(estudianteList1EstudianteToAttach);
            }
            padre.setEstudianteList1(attachedEstudianteList1);
            em.persist(padre);
            for (Estudiante estudianteListEstudiante : padre.getEstudianteList()) {
                Padre oldPadreOfEstudianteListEstudiante = estudianteListEstudiante.getPadre();
                estudianteListEstudiante.setPadre(padre);
                estudianteListEstudiante = em.merge(estudianteListEstudiante);
                if (oldPadreOfEstudianteListEstudiante != null) {
                    oldPadreOfEstudianteListEstudiante.getEstudianteList().remove(estudianteListEstudiante);
                    oldPadreOfEstudianteListEstudiante = em.merge(oldPadreOfEstudianteListEstudiante);
                }
            }
            for (Estudiante estudianteList1Estudiante : padre.getEstudianteList1()) {
                Padre oldPadre1OfEstudianteList1Estudiante = estudianteList1Estudiante.getPadre1();
                estudianteList1Estudiante.setPadre1(padre);
                estudianteList1Estudiante = em.merge(estudianteList1Estudiante);
                if (oldPadre1OfEstudianteList1Estudiante != null) {
                    oldPadre1OfEstudianteList1Estudiante.getEstudianteList1().remove(estudianteList1Estudiante);
                    oldPadre1OfEstudianteList1Estudiante = em.merge(oldPadre1OfEstudianteList1Estudiante);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPadre(padre.getIdPadre()) != null) {
                throw new PreexistingEntityException("Padre " + padre + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Padre padre) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Padre persistentPadre = em.find(Padre.class, padre.getIdPadre());
            List<Estudiante> estudianteListOld = persistentPadre.getEstudianteList();
            List<Estudiante> estudianteListNew = padre.getEstudianteList();
            List<Estudiante> estudianteList1Old = persistentPadre.getEstudianteList1();
            List<Estudiante> estudianteList1New = padre.getEstudianteList1();
            List<Estudiante> attachedEstudianteListNew = new ArrayList<Estudiante>();
            for (Estudiante estudianteListNewEstudianteToAttach : estudianteListNew) {
                estudianteListNewEstudianteToAttach = em.getReference(estudianteListNewEstudianteToAttach.getClass(), estudianteListNewEstudianteToAttach.getIdEstudiante());
                attachedEstudianteListNew.add(estudianteListNewEstudianteToAttach);
            }
            estudianteListNew = attachedEstudianteListNew;
            padre.setEstudianteList(estudianteListNew);
            List<Estudiante> attachedEstudianteList1New = new ArrayList<Estudiante>();
            for (Estudiante estudianteList1NewEstudianteToAttach : estudianteList1New) {
                estudianteList1NewEstudianteToAttach = em.getReference(estudianteList1NewEstudianteToAttach.getClass(), estudianteList1NewEstudianteToAttach.getIdEstudiante());
                attachedEstudianteList1New.add(estudianteList1NewEstudianteToAttach);
            }
            estudianteList1New = attachedEstudianteList1New;
            padre.setEstudianteList1(estudianteList1New);
            padre = em.merge(padre);
            for (Estudiante estudianteListOldEstudiante : estudianteListOld) {
                if (!estudianteListNew.contains(estudianteListOldEstudiante)) {
                    estudianteListOldEstudiante.setPadre(null);
                    estudianteListOldEstudiante = em.merge(estudianteListOldEstudiante);
                }
            }
            for (Estudiante estudianteListNewEstudiante : estudianteListNew) {
                if (!estudianteListOld.contains(estudianteListNewEstudiante)) {
                    Padre oldPadreOfEstudianteListNewEstudiante = estudianteListNewEstudiante.getPadre();
                    estudianteListNewEstudiante.setPadre(padre);
                    estudianteListNewEstudiante = em.merge(estudianteListNewEstudiante);
                    if (oldPadreOfEstudianteListNewEstudiante != null && !oldPadreOfEstudianteListNewEstudiante.equals(padre)) {
                        oldPadreOfEstudianteListNewEstudiante.getEstudianteList().remove(estudianteListNewEstudiante);
                        oldPadreOfEstudianteListNewEstudiante = em.merge(oldPadreOfEstudianteListNewEstudiante);
                    }
                }
            }
            for (Estudiante estudianteList1OldEstudiante : estudianteList1Old) {
                if (!estudianteList1New.contains(estudianteList1OldEstudiante)) {
                    estudianteList1OldEstudiante.setPadre1(null);
                    estudianteList1OldEstudiante = em.merge(estudianteList1OldEstudiante);
                }
            }
            for (Estudiante estudianteList1NewEstudiante : estudianteList1New) {
                if (!estudianteList1Old.contains(estudianteList1NewEstudiante)) {
                    Padre oldPadre1OfEstudianteList1NewEstudiante = estudianteList1NewEstudiante.getPadre1();
                    estudianteList1NewEstudiante.setPadre1(padre);
                    estudianteList1NewEstudiante = em.merge(estudianteList1NewEstudiante);
                    if (oldPadre1OfEstudianteList1NewEstudiante != null && !oldPadre1OfEstudianteList1NewEstudiante.equals(padre)) {
                        oldPadre1OfEstudianteList1NewEstudiante.getEstudianteList1().remove(estudianteList1NewEstudiante);
                        oldPadre1OfEstudianteList1NewEstudiante = em.merge(oldPadre1OfEstudianteList1NewEstudiante);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = padre.getIdPadre();
                if (findPadre(id) == null) {
                    throw new NonexistentEntityException("The padre with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Padre padre;
            try {
                padre = em.getReference(Padre.class, id);
                padre.getIdPadre();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The padre with id " + id + " no longer exists.", enfe);
            }
            List<Estudiante> estudianteList = padre.getEstudianteList();
            for (Estudiante estudianteListEstudiante : estudianteList) {
                estudianteListEstudiante.setPadre(null);
                estudianteListEstudiante = em.merge(estudianteListEstudiante);
            }
            List<Estudiante> estudianteList1 = padre.getEstudianteList1();
            for (Estudiante estudianteList1Estudiante : estudianteList1) {
                estudianteList1Estudiante.setPadre1(null);
                estudianteList1Estudiante = em.merge(estudianteList1Estudiante);
            }
            em.remove(padre);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Padre> findPadreEntities() {
        return findPadreEntities(true, -1, -1);
    }

    public List<Padre> findPadreEntities(int maxResults, int firstResult) {
        return findPadreEntities(false, maxResults, firstResult);
    }

    private List<Padre> findPadreEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Padre.class));
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

    public Padre findPadre(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Padre.class, id);
        } finally {
            em.close();
        }
    }

    public int getPadreCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Padre> rt = cq.from(Padre.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
