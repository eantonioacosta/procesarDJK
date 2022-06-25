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
import djk.procesardkj.domain.Estudiante;
import djk.procesardkj.domain.Grupo;
import djk.procesardkj.domain.Matricula;
import djk.procesardkj.domain.Nota;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ENOR ACOSTA
 */
public class MatriculaJpaController implements Serializable {

    public MatriculaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public MatriculaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Matricula matricula) {
        if (matricula.getNotaList() == null) {
            matricula.setNotaList(new ArrayList<Nota>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Estudiante estudiante = matricula.getEstudiante();
            if (estudiante != null) {
                estudiante = em.getReference(estudiante.getClass(), estudiante.getIdEstudiante());
                matricula.setEstudiante(estudiante);
            }
            Grupo grupo = matricula.getGrupo();
            if (grupo != null) {
                grupo = em.getReference(grupo.getClass(), grupo.getIdGrupo());
                matricula.setGrupo(grupo);
            }
            List<Nota> attachedNotaList = new ArrayList<Nota>();
            for (Nota notaListNotaToAttach : matricula.getNotaList()) {
                notaListNotaToAttach = em.getReference(notaListNotaToAttach.getClass(), notaListNotaToAttach.getIdNotas());
                attachedNotaList.add(notaListNotaToAttach);
            }
            matricula.setNotaList(attachedNotaList);
            em.persist(matricula);
            if (estudiante != null) {
                estudiante.getMatriculaList().add(matricula);
                estudiante = em.merge(estudiante);
            }
            if (grupo != null) {
                grupo.getMatriculaList().add(matricula);
                grupo = em.merge(grupo);
            }
            for (Nota notaListNota : matricula.getNotaList()) {
                Matricula oldMatriculaOfNotaListNota = notaListNota.getMatricula();
                notaListNota.setMatricula(matricula);
                notaListNota = em.merge(notaListNota);
                if (oldMatriculaOfNotaListNota != null) {
                    oldMatriculaOfNotaListNota.getNotaList().remove(notaListNota);
                    oldMatriculaOfNotaListNota = em.merge(oldMatriculaOfNotaListNota);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Matricula matricula) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Matricula persistentMatricula = em.find(Matricula.class, matricula.getIdMatricula());
            Estudiante estudianteOld = persistentMatricula.getEstudiante();
            Estudiante estudianteNew = matricula.getEstudiante();
            Grupo grupoOld = persistentMatricula.getGrupo();
            Grupo grupoNew = matricula.getGrupo();
            List<Nota> notaListOld = persistentMatricula.getNotaList();
            List<Nota> notaListNew = matricula.getNotaList();
            if (estudianteNew != null) {
                estudianteNew = em.getReference(estudianteNew.getClass(), estudianteNew.getIdEstudiante());
                matricula.setEstudiante(estudianteNew);
            }
            if (grupoNew != null) {
                grupoNew = em.getReference(grupoNew.getClass(), grupoNew.getIdGrupo());
                matricula.setGrupo(grupoNew);
            }
            List<Nota> attachedNotaListNew = new ArrayList<Nota>();
            for (Nota notaListNewNotaToAttach : notaListNew) {
                notaListNewNotaToAttach = em.getReference(notaListNewNotaToAttach.getClass(), notaListNewNotaToAttach.getIdNotas());
                attachedNotaListNew.add(notaListNewNotaToAttach);
            }
            notaListNew = attachedNotaListNew;
            matricula.setNotaList(notaListNew);
            matricula = em.merge(matricula);
            if (estudianteOld != null && !estudianteOld.equals(estudianteNew)) {
                estudianteOld.getMatriculaList().remove(matricula);
                estudianteOld = em.merge(estudianteOld);
            }
            if (estudianteNew != null && !estudianteNew.equals(estudianteOld)) {
                estudianteNew.getMatriculaList().add(matricula);
                estudianteNew = em.merge(estudianteNew);
            }
            if (grupoOld != null && !grupoOld.equals(grupoNew)) {
                grupoOld.getMatriculaList().remove(matricula);
                grupoOld = em.merge(grupoOld);
            }
            if (grupoNew != null && !grupoNew.equals(grupoOld)) {
                grupoNew.getMatriculaList().add(matricula);
                grupoNew = em.merge(grupoNew);
            }
            for (Nota notaListOldNota : notaListOld) {
                if (!notaListNew.contains(notaListOldNota)) {
                    notaListOldNota.setMatricula(null);
                    notaListOldNota = em.merge(notaListOldNota);
                }
            }
            for (Nota notaListNewNota : notaListNew) {
                if (!notaListOld.contains(notaListNewNota)) {
                    Matricula oldMatriculaOfNotaListNewNota = notaListNewNota.getMatricula();
                    notaListNewNota.setMatricula(matricula);
                    notaListNewNota = em.merge(notaListNewNota);
                    if (oldMatriculaOfNotaListNewNota != null && !oldMatriculaOfNotaListNewNota.equals(matricula)) {
                        oldMatriculaOfNotaListNewNota.getNotaList().remove(notaListNewNota);
                        oldMatriculaOfNotaListNewNota = em.merge(oldMatriculaOfNotaListNewNota);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = matricula.getIdMatricula();
                if (findMatricula(id) == null) {
                    throw new NonexistentEntityException("The matricula with id " + id + " no longer exists.");
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
            Matricula matricula;
            try {
                matricula = em.getReference(Matricula.class, id);
                matricula.getIdMatricula();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The matricula with id " + id + " no longer exists.", enfe);
            }
            Estudiante estudiante = matricula.getEstudiante();
            if (estudiante != null) {
                estudiante.getMatriculaList().remove(matricula);
                estudiante = em.merge(estudiante);
            }
            Grupo grupo = matricula.getGrupo();
            if (grupo != null) {
                grupo.getMatriculaList().remove(matricula);
                grupo = em.merge(grupo);
            }
            List<Nota> notaList = matricula.getNotaList();
            for (Nota notaListNota : notaList) {
                notaListNota.setMatricula(null);
                notaListNota = em.merge(notaListNota);
            }
            em.remove(matricula);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Matricula> findMatriculaEntities() {
        return findMatriculaEntities(true, -1, -1);
    }

    public List<Matricula> findMatriculaEntities(int maxResults, int firstResult) {
        return findMatriculaEntities(false, maxResults, firstResult);
    }

    private List<Matricula> findMatriculaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Matricula.class));
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

    public Matricula findMatricula(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Matricula.class, id);
        } finally {
            em.close();
        }
    }

    public int getMatriculaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Matricula> rt = cq.from(Matricula.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
