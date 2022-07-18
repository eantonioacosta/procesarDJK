/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.datos;

import djk.procesardkj.datos.exceptions.NonexistentEntityException;
import djk.procesardkj.domain.Estudiante;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import djk.procesardkj.domain.Padre;
import djk.procesardkj.domain.Nota;
import java.util.ArrayList;
import java.util.List;
import djk.procesardkj.domain.Matricula;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author ENOR ACOSTA
 */
public class EstudianteJpaController implements Serializable {

    public EstudianteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EstudianteJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Estudiante estudiante) {
        if (estudiante.getNotaList() == null) {
            estudiante.setNotaList(new ArrayList<Nota>());
        }
        if (estudiante.getMatriculaList() == null) {
            estudiante.setMatriculaList(new ArrayList<Matricula>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Padre padre = estudiante.getPadre();
            if (padre != null) {
                padre = em.getReference(padre.getClass(), padre.getIdPadre());
                estudiante.setPadre(padre);
            }
            Padre padre1 = estudiante.getPadre1();
            if (padre1 != null) {
                padre1 = em.getReference(padre1.getClass(), padre1.getIdPadre());
                estudiante.setPadre1(padre1);
            }
            List<Nota> attachedNotaList = new ArrayList<Nota>();
            for (Nota notaListNotaToAttach : estudiante.getNotaList()) {
                notaListNotaToAttach = em.getReference(notaListNotaToAttach.getClass(), notaListNotaToAttach.getIdNotas());
                attachedNotaList.add(notaListNotaToAttach);
            }
            estudiante.setNotaList(attachedNotaList);
            List<Matricula> attachedMatriculaList = new ArrayList<Matricula>();
            for (Matricula matriculaListMatriculaToAttach : estudiante.getMatriculaList()) {
                matriculaListMatriculaToAttach = em.getReference(matriculaListMatriculaToAttach.getClass(), matriculaListMatriculaToAttach.getIdMatricula());
                attachedMatriculaList.add(matriculaListMatriculaToAttach);
            }
            estudiante.setMatriculaList(attachedMatriculaList);
            em.persist(estudiante);
            if (padre != null) {
                padre.getEstudianteList().add(estudiante);
                padre = em.merge(padre);
            }
            if (padre1 != null) {
                padre1.getEstudianteList().add(estudiante);
                padre1 = em.merge(padre1);
            }
            for (Nota notaListNota : estudiante.getNotaList()) {
                Estudiante oldEstudianteOfNotaListNota = notaListNota.getEstudiante();
                notaListNota.setEstudiante(estudiante);
                notaListNota = em.merge(notaListNota);
                if (oldEstudianteOfNotaListNota != null) {
                    oldEstudianteOfNotaListNota.getNotaList().remove(notaListNota);
                    oldEstudianteOfNotaListNota = em.merge(oldEstudianteOfNotaListNota);
                }
            }
            for (Matricula matriculaListMatricula : estudiante.getMatriculaList()) {
                Estudiante oldEstudianteOfMatriculaListMatricula = matriculaListMatricula.getEstudiante();
                matriculaListMatricula.setEstudiante(estudiante);
                matriculaListMatricula = em.merge(matriculaListMatricula);
                if (oldEstudianteOfMatriculaListMatricula != null) {
                    oldEstudianteOfMatriculaListMatricula.getMatriculaList().remove(matriculaListMatricula);
                    oldEstudianteOfMatriculaListMatricula = em.merge(oldEstudianteOfMatriculaListMatricula);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Estudiante estudiante) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Estudiante persistentEstudiante = em.find(Estudiante.class, estudiante.getIdEstudiante());
            Padre padreOld = persistentEstudiante.getPadre();
            Padre padreNew = estudiante.getPadre();
            Padre padre1Old = persistentEstudiante.getPadre1();
            Padre padre1New = estudiante.getPadre1();
            List<Nota> notaListOld = persistentEstudiante.getNotaList();
            List<Nota> notaListNew = estudiante.getNotaList();
            List<Matricula> matriculaListOld = persistentEstudiante.getMatriculaList();
            List<Matricula> matriculaListNew = estudiante.getMatriculaList();
            if (padreNew != null) {
                padreNew = em.getReference(padreNew.getClass(), padreNew.getIdPadre());
                estudiante.setPadre(padreNew);
            }
            if (padre1New != null) {
                padre1New = em.getReference(padre1New.getClass(), padre1New.getIdPadre());
                estudiante.setPadre1(padre1New);
            }
            List<Nota> attachedNotaListNew = new ArrayList<Nota>();
            for (Nota notaListNewNotaToAttach : notaListNew) {
                notaListNewNotaToAttach = em.getReference(notaListNewNotaToAttach.getClass(), notaListNewNotaToAttach.getIdNotas());
                attachedNotaListNew.add(notaListNewNotaToAttach);
            }
            notaListNew = attachedNotaListNew;
            estudiante.setNotaList(notaListNew);
            List<Matricula> attachedMatriculaListNew = new ArrayList<Matricula>();
            for (Matricula matriculaListNewMatriculaToAttach : matriculaListNew) {
                matriculaListNewMatriculaToAttach = em.getReference(matriculaListNewMatriculaToAttach.getClass(), matriculaListNewMatriculaToAttach.getIdMatricula());
                attachedMatriculaListNew.add(matriculaListNewMatriculaToAttach);
            }
            matriculaListNew = attachedMatriculaListNew;
            estudiante.setMatriculaList(matriculaListNew);
            estudiante = em.merge(estudiante);
            if (padreOld != null && !padreOld.equals(padreNew)) {
                padreOld.getEstudianteList().remove(estudiante);
                padreOld = em.merge(padreOld);
            }
            if (padreNew != null && !padreNew.equals(padreOld)) {
                padreNew.getEstudianteList().add(estudiante);
                padreNew = em.merge(padreNew);
            }
            if (padre1Old != null && !padre1Old.equals(padre1New)) {
                padre1Old.getEstudianteList().remove(estudiante);
                padre1Old = em.merge(padre1Old);
            }
            if (padre1New != null && !padre1New.equals(padre1Old)) {
                padre1New.getEstudianteList().add(estudiante);
                padre1New = em.merge(padre1New);
            }
            for (Nota notaListOldNota : notaListOld) {
                if (!notaListNew.contains(notaListOldNota)) {
                    notaListOldNota.setEstudiante(null);
                    notaListOldNota = em.merge(notaListOldNota);
                }
            }
            for (Nota notaListNewNota : notaListNew) {
                if (!notaListOld.contains(notaListNewNota)) {
                    Estudiante oldEstudianteOfNotaListNewNota = notaListNewNota.getEstudiante();
                    notaListNewNota.setEstudiante(estudiante);
                    notaListNewNota = em.merge(notaListNewNota);
                    if (oldEstudianteOfNotaListNewNota != null && !oldEstudianteOfNotaListNewNota.equals(estudiante)) {
                        oldEstudianteOfNotaListNewNota.getNotaList().remove(notaListNewNota);
                        oldEstudianteOfNotaListNewNota = em.merge(oldEstudianteOfNotaListNewNota);
                    }
                }
            }
            for (Matricula matriculaListOldMatricula : matriculaListOld) {
                if (!matriculaListNew.contains(matriculaListOldMatricula)) {
                    matriculaListOldMatricula.setEstudiante(null);
                    matriculaListOldMatricula = em.merge(matriculaListOldMatricula);
                }
            }
            for (Matricula matriculaListNewMatricula : matriculaListNew) {
                if (!matriculaListOld.contains(matriculaListNewMatricula)) {
                    Estudiante oldEstudianteOfMatriculaListNewMatricula = matriculaListNewMatricula.getEstudiante();
                    matriculaListNewMatricula.setEstudiante(estudiante);
                    matriculaListNewMatricula = em.merge(matriculaListNewMatricula);
                    if (oldEstudianteOfMatriculaListNewMatricula != null && !oldEstudianteOfMatriculaListNewMatricula.equals(estudiante)) {
                        oldEstudianteOfMatriculaListNewMatricula.getMatriculaList().remove(matriculaListNewMatricula);
                        oldEstudianteOfMatriculaListNewMatricula = em.merge(oldEstudianteOfMatriculaListNewMatricula);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = estudiante.getIdEstudiante();
                if (findEstudiante(id) == null) {
                    throw new NonexistentEntityException("The estudiante with id " + id + " no longer exists.");
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
            Estudiante estudiante;
            try {
                estudiante = em.getReference(Estudiante.class, id);
                estudiante.getIdEstudiante();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The estudiante with id " + id + " no longer exists.", enfe);
            }
            Padre padre = estudiante.getPadre();
            if (padre != null) {
                padre.getEstudianteList().remove(estudiante);
                padre = em.merge(padre);
            }
            Padre padre1 = estudiante.getPadre1();
            if (padre1 != null) {
                padre1.getEstudianteList().remove(estudiante);
                padre1 = em.merge(padre1);
            }
            List<Nota> notaList = estudiante.getNotaList();
            for (Nota notaListNota : notaList) {
                notaListNota.setEstudiante(null);
                notaListNota = em.merge(notaListNota);
            }
            List<Matricula> matriculaList = estudiante.getMatriculaList();
            for (Matricula matriculaListMatricula : matriculaList) {
                matriculaListMatricula.setEstudiante(null);
                matriculaListMatricula = em.merge(matriculaListMatricula);
            }
            em.remove(estudiante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Estudiante> findEstudianteEntities() {
        return findEstudianteEntities(true, -1, -1);
    }

    public List<Estudiante> findEstudianteEntities(int maxResults, int firstResult) {
        return findEstudianteEntities(false, maxResults, firstResult);
    }

    private List<Estudiante> findEstudianteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Estudiante.class));
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

    public Estudiante findEstudiante(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Estudiante.class, id);
        } finally {
            em.close();
        }
    }

    public int getEstudianteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Estudiante> rt = cq.from(Estudiante.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
