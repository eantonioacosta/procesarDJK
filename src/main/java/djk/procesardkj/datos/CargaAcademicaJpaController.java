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
import djk.procesardkj.domain.AnioLectivo;
import djk.procesardkj.domain.Asignatura;
import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Docente;
import djk.procesardkj.domain.Grupo;
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
public class CargaAcademicaJpaController implements Serializable {

    public CargaAcademicaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public CargaAcademicaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CargaAcademica cargaAcademica) {
        if (cargaAcademica.getNotaList() == null) {
            cargaAcademica.setNotaList(new ArrayList<Nota>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            AnioLectivo anioLectivo = cargaAcademica.getAnioLectivo();
            if (anioLectivo != null) {
                anioLectivo = em.getReference(anioLectivo.getClass(), anioLectivo.getIdAnioLectivo());
                cargaAcademica.setAnioLectivo(anioLectivo);
            }
            Asignatura asignatura = cargaAcademica.getAsignatura();
            if (asignatura != null) {
                asignatura = em.getReference(asignatura.getClass(), asignatura.getIdAsignatura());
                cargaAcademica.setAsignatura(asignatura);
            }
            Docente docente = cargaAcademica.getDocente();
            if (docente != null) {
                docente = em.getReference(docente.getClass(), docente.getIdDocente());
                cargaAcademica.setDocente(docente);
            }
            Grupo grupo = cargaAcademica.getGrupo();
            if (grupo != null) {
                grupo = em.getReference(grupo.getClass(), grupo.getIdGrupo());
                cargaAcademica.setGrupo(grupo);
            }
            List<Nota> attachedNotaList = new ArrayList<Nota>();
            for (Nota notaListNotaToAttach : cargaAcademica.getNotaList()) {
                notaListNotaToAttach = em.getReference(notaListNotaToAttach.getClass(), notaListNotaToAttach.getIdNotas());
                attachedNotaList.add(notaListNotaToAttach);
            }
            cargaAcademica.setNotaList(attachedNotaList);
            em.persist(cargaAcademica);
            if (anioLectivo != null) {
                anioLectivo.getCargaAcademicaList().add(cargaAcademica);
                anioLectivo = em.merge(anioLectivo);
            }
            if (asignatura != null) {
                asignatura.getCargaAcademicaList().add(cargaAcademica);
                asignatura = em.merge(asignatura);
            }
            if (docente != null) {
                docente.getCargaAcademicaList().add(cargaAcademica);
                docente = em.merge(docente);
            }
            if (grupo != null) {
                grupo.getCargaAcademicaList().add(cargaAcademica);
                grupo = em.merge(grupo);
            }
            for (Nota notaListNota : cargaAcademica.getNotaList()) {
                CargaAcademica oldCargaAcademicaOfNotaListNota = notaListNota.getCargaAcademica();
                notaListNota.setCargaAcademica(cargaAcademica);
                notaListNota = em.merge(notaListNota);
                if (oldCargaAcademicaOfNotaListNota != null) {
                    oldCargaAcademicaOfNotaListNota.getNotaList().remove(notaListNota);
                    oldCargaAcademicaOfNotaListNota = em.merge(oldCargaAcademicaOfNotaListNota);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CargaAcademica cargaAcademica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            CargaAcademica persistentCargaAcademica = em.find(CargaAcademica.class, cargaAcademica.getIdCarga());
            AnioLectivo anioLectivoOld = persistentCargaAcademica.getAnioLectivo();
            AnioLectivo anioLectivoNew = cargaAcademica.getAnioLectivo();
            Asignatura asignaturaOld = persistentCargaAcademica.getAsignatura();
            Asignatura asignaturaNew = cargaAcademica.getAsignatura();
            Docente docenteOld = persistentCargaAcademica.getDocente();
            Docente docenteNew = cargaAcademica.getDocente();
            Grupo grupoOld = persistentCargaAcademica.getGrupo();
            Grupo grupoNew = cargaAcademica.getGrupo();
            List<Nota> notaListOld = persistentCargaAcademica.getNotaList();
            List<Nota> notaListNew = cargaAcademica.getNotaList();
            if (anioLectivoNew != null) {
                anioLectivoNew = em.getReference(anioLectivoNew.getClass(), anioLectivoNew.getIdAnioLectivo());
                cargaAcademica.setAnioLectivo(anioLectivoNew);
            }
            if (asignaturaNew != null) {
                asignaturaNew = em.getReference(asignaturaNew.getClass(), asignaturaNew.getIdAsignatura());
                cargaAcademica.setAsignatura(asignaturaNew);
            }
            if (docenteNew != null) {
                docenteNew = em.getReference(docenteNew.getClass(), docenteNew.getIdDocente());
                cargaAcademica.setDocente(docenteNew);
            }
            if (grupoNew != null) {
                grupoNew = em.getReference(grupoNew.getClass(), grupoNew.getIdGrupo());
                cargaAcademica.setGrupo(grupoNew);
            }
            List<Nota> attachedNotaListNew = new ArrayList<Nota>();
            for (Nota notaListNewNotaToAttach : notaListNew) {
                notaListNewNotaToAttach = em.getReference(notaListNewNotaToAttach.getClass(), notaListNewNotaToAttach.getIdNotas());
                attachedNotaListNew.add(notaListNewNotaToAttach);
            }
            notaListNew = attachedNotaListNew;
            cargaAcademica.setNotaList(notaListNew);
            cargaAcademica = em.merge(cargaAcademica);
            if (anioLectivoOld != null && !anioLectivoOld.equals(anioLectivoNew)) {
                anioLectivoOld.getCargaAcademicaList().remove(cargaAcademica);
                anioLectivoOld = em.merge(anioLectivoOld);
            }
            if (anioLectivoNew != null && !anioLectivoNew.equals(anioLectivoOld)) {
                anioLectivoNew.getCargaAcademicaList().add(cargaAcademica);
                anioLectivoNew = em.merge(anioLectivoNew);
            }
            if (asignaturaOld != null && !asignaturaOld.equals(asignaturaNew)) {
                asignaturaOld.getCargaAcademicaList().remove(cargaAcademica);
                asignaturaOld = em.merge(asignaturaOld);
            }
            if (asignaturaNew != null && !asignaturaNew.equals(asignaturaOld)) {
                asignaturaNew.getCargaAcademicaList().add(cargaAcademica);
                asignaturaNew = em.merge(asignaturaNew);
            }
            if (docenteOld != null && !docenteOld.equals(docenteNew)) {
                docenteOld.getCargaAcademicaList().remove(cargaAcademica);
                docenteOld = em.merge(docenteOld);
            }
            if (docenteNew != null && !docenteNew.equals(docenteOld)) {
                docenteNew.getCargaAcademicaList().add(cargaAcademica);
                docenteNew = em.merge(docenteNew);
            }
            if (grupoOld != null && !grupoOld.equals(grupoNew)) {
                grupoOld.getCargaAcademicaList().remove(cargaAcademica);
                grupoOld = em.merge(grupoOld);
            }
            if (grupoNew != null && !grupoNew.equals(grupoOld)) {
                grupoNew.getCargaAcademicaList().add(cargaAcademica);
                grupoNew = em.merge(grupoNew);
            }
            for (Nota notaListOldNota : notaListOld) {
                if (!notaListNew.contains(notaListOldNota)) {
                    notaListOldNota.setCargaAcademica(null);
                    notaListOldNota = em.merge(notaListOldNota);
                }
            }
            for (Nota notaListNewNota : notaListNew) {
                if (!notaListOld.contains(notaListNewNota)) {
                    CargaAcademica oldCargaAcademicaOfNotaListNewNota = notaListNewNota.getCargaAcademica();
                    notaListNewNota.setCargaAcademica(cargaAcademica);
                    notaListNewNota = em.merge(notaListNewNota);
                    if (oldCargaAcademicaOfNotaListNewNota != null && !oldCargaAcademicaOfNotaListNewNota.equals(cargaAcademica)) {
                        oldCargaAcademicaOfNotaListNewNota.getNotaList().remove(notaListNewNota);
                        oldCargaAcademicaOfNotaListNewNota = em.merge(oldCargaAcademicaOfNotaListNewNota);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = cargaAcademica.getIdCarga();
                if (findCargaAcademica(id) == null) {
                    throw new NonexistentEntityException("The cargaAcademica with id " + id + " no longer exists.");
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
            CargaAcademica cargaAcademica;
            try {
                cargaAcademica = em.getReference(CargaAcademica.class, id);
                cargaAcademica.getIdCarga();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cargaAcademica with id " + id + " no longer exists.", enfe);
            }
            AnioLectivo anioLectivo = cargaAcademica.getAnioLectivo();
            if (anioLectivo != null) {
                anioLectivo.getCargaAcademicaList().remove(cargaAcademica);
                anioLectivo = em.merge(anioLectivo);
            }
            Asignatura asignatura = cargaAcademica.getAsignatura();
            if (asignatura != null) {
                asignatura.getCargaAcademicaList().remove(cargaAcademica);
                asignatura = em.merge(asignatura);
            }
            Docente docente = cargaAcademica.getDocente();
            if (docente != null) {
                docente.getCargaAcademicaList().remove(cargaAcademica);
                docente = em.merge(docente);
            }
            Grupo grupo = cargaAcademica.getGrupo();
            if (grupo != null) {
                grupo.getCargaAcademicaList().remove(cargaAcademica);
                grupo = em.merge(grupo);
            }
            List<Nota> notaList = cargaAcademica.getNotaList();
            for (Nota notaListNota : notaList) {
                notaListNota.setCargaAcademica(null);
                notaListNota = em.merge(notaListNota);
            }
            em.remove(cargaAcademica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CargaAcademica> findCargaAcademicaEntities() {
        return findCargaAcademicaEntities(true, -1, -1);
    }

    public List<CargaAcademica> findCargaAcademicaEntities(int maxResults, int firstResult) {
        return findCargaAcademicaEntities(false, maxResults, firstResult);
    }

    private List<CargaAcademica> findCargaAcademicaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CargaAcademica.class));
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

    public CargaAcademica findCargaAcademica(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CargaAcademica.class, id);
        } finally {
            em.close();
        }
    }

    public int getCargaAcademicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CargaAcademica> rt = cq.from(CargaAcademica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
