/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.datos;

import djk.procesardkj.datos.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Estudiante;
import djk.procesardkj.domain.Matricula;
import djk.procesardkj.domain.Nota;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ENOR ACOSTA
 */
public class NotaJpaController implements Serializable {

    public NotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public NotaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Nota nota) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CargaAcademica cargaAcademica = nota.getCargaAcademica();
            if (cargaAcademica != null) {
                cargaAcademica = em.getReference(cargaAcademica.getClass(), cargaAcademica.getIdCarga());
                nota.setCargaAcademica(cargaAcademica);
            }
            Estudiante estudiante = nota.getEstudiante();
            if (estudiante != null) {
                estudiante = em.getReference(estudiante.getClass(), estudiante.getIdEstudiante());
                nota.setEstudiante(estudiante);
            }
            Matricula matricula = nota.getMatricula();
            if (matricula != null) {
                matricula = em.getReference(matricula.getClass(), matricula.getIdMatricula());
                nota.setMatricula(matricula);
            }
            em.persist(nota);
            if (cargaAcademica != null) {
                cargaAcademica.getNotaList().add(nota);
                cargaAcademica = em.merge(cargaAcademica);
            }
            if (estudiante != null) {
                estudiante.getNotaList().add(nota);
                estudiante = em.merge(estudiante);
            }
            if (matricula != null) {
                matricula.getNotaList().add(nota);
                matricula = em.merge(matricula);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Nota nota) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Nota persistentNota = em.find(Nota.class, nota.getIdNotas());
            CargaAcademica cargaAcademicaOld = persistentNota.getCargaAcademica();
            CargaAcademica cargaAcademicaNew = nota.getCargaAcademica();
            Estudiante estudianteOld = persistentNota.getEstudiante();
            Estudiante estudianteNew = nota.getEstudiante();
            Matricula matriculaOld = persistentNota.getMatricula();
            Matricula matriculaNew = nota.getMatricula();
            if (cargaAcademicaNew != null) {
                cargaAcademicaNew = em.getReference(cargaAcademicaNew.getClass(), cargaAcademicaNew.getIdCarga());
                nota.setCargaAcademica(cargaAcademicaNew);
            }
            if (estudianteNew != null) {
                estudianteNew = em.getReference(estudianteNew.getClass(), estudianteNew.getIdEstudiante());
                nota.setEstudiante(estudianteNew);
            }
            if (matriculaNew != null) {
                matriculaNew = em.getReference(matriculaNew.getClass(), matriculaNew.getIdMatricula());
                nota.setMatricula(matriculaNew);
            }
            nota = em.merge(nota);
            if (cargaAcademicaOld != null && !cargaAcademicaOld.equals(cargaAcademicaNew)) {
                cargaAcademicaOld.getNotaList().remove(nota);
                cargaAcademicaOld = em.merge(cargaAcademicaOld);
            }
            if (cargaAcademicaNew != null && !cargaAcademicaNew.equals(cargaAcademicaOld)) {
                cargaAcademicaNew.getNotaList().add(nota);
                cargaAcademicaNew = em.merge(cargaAcademicaNew);
            }
            if (estudianteOld != null && !estudianteOld.equals(estudianteNew)) {
                estudianteOld.getNotaList().remove(nota);
                estudianteOld = em.merge(estudianteOld);
            }
            if (estudianteNew != null && !estudianteNew.equals(estudianteOld)) {
                estudianteNew.getNotaList().add(nota);
                estudianteNew = em.merge(estudianteNew);
            }
            if (matriculaOld != null && !matriculaOld.equals(matriculaNew)) {
                matriculaOld.getNotaList().remove(nota);
                matriculaOld = em.merge(matriculaOld);
            }
            if (matriculaNew != null && !matriculaNew.equals(matriculaOld)) {
                matriculaNew.getNotaList().add(nota);
                matriculaNew = em.merge(matriculaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = nota.getIdNotas();
                if (findNota(id) == null) {
                    throw new NonexistentEntityException("The nota with id " + id + " no longer exists.");
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
            Nota nota;
            try {
                nota = em.getReference(Nota.class, id);
                nota.getIdNotas();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The nota with id " + id + " no longer exists.", enfe);
            }
            CargaAcademica cargaAcademica = nota.getCargaAcademica();
            if (cargaAcademica != null) {
                cargaAcademica.getNotaList().remove(nota);
                cargaAcademica = em.merge(cargaAcademica);
            }
            Estudiante estudiante = nota.getEstudiante();
            if (estudiante != null) {
                estudiante.getNotaList().remove(nota);
                estudiante = em.merge(estudiante);
            }
            Matricula matricula = nota.getMatricula();
            if (matricula != null) {
                matricula.getNotaList().remove(nota);
                matricula = em.merge(matricula);
            }
            em.remove(nota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Nota> findNotaEntities() {
        return findNotaEntities(true, -1, -1);
    }

    public List<Nota> findNotaEntities(int maxResults, int firstResult) {
        return findNotaEntities(false, maxResults, firstResult);
    }

    private List<Nota> findNotaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Nota.class));
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

    public Nota findNota(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Nota.class, id);
        } finally {
            em.close();
        }
    }

    public int getNotaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Nota> rt = cq.from(Nota.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
