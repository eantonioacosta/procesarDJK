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
import djk.procesardkj.domain.Docente;
import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Grupo;
import java.util.ArrayList;
import java.util.List;
import djk.procesardkj.domain.Matricula;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ENOR ACOSTA
 */
public class GrupoJpaController implements Serializable {

    public GrupoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public GrupoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Grupo grupo) {
        if (grupo.getCargaAcademicaList() == null) {
            grupo.setCargaAcademicaList(new ArrayList<CargaAcademica>());
        }
        if (grupo.getMatriculaList() == null) {
            grupo.setMatriculaList(new ArrayList<Matricula>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            AnioLectivo anioLectivo = grupo.getAnioLectivo();
            if (anioLectivo != null) {
                anioLectivo = em.getReference(anioLectivo.getClass(), anioLectivo.getIdAnioLectivo());
                grupo.setAnioLectivo(anioLectivo);
            }
            Docente docente = grupo.getDocente();
            if (docente != null) {
                docente = em.getReference(docente.getClass(), docente.getIdDocente());
                grupo.setDocente(docente);
            }
            List<CargaAcademica> attachedCargaAcademicaList = new ArrayList<CargaAcademica>();
            for (CargaAcademica cargaAcademicaListCargaAcademicaToAttach : grupo.getCargaAcademicaList()) {
                cargaAcademicaListCargaAcademicaToAttach = em.getReference(cargaAcademicaListCargaAcademicaToAttach.getClass(), cargaAcademicaListCargaAcademicaToAttach.getIdCarga());
                attachedCargaAcademicaList.add(cargaAcademicaListCargaAcademicaToAttach);
            }
            grupo.setCargaAcademicaList(attachedCargaAcademicaList);
            List<Matricula> attachedMatriculaList = new ArrayList<Matricula>();
            for (Matricula matriculaListMatriculaToAttach : grupo.getMatriculaList()) {
                matriculaListMatriculaToAttach = em.getReference(matriculaListMatriculaToAttach.getClass(), matriculaListMatriculaToAttach.getIdMatricula());
                attachedMatriculaList.add(matriculaListMatriculaToAttach);
            }
            grupo.setMatriculaList(attachedMatriculaList);
            em.persist(grupo);
            if (anioLectivo != null) {
                anioLectivo.getGrupoList().add(grupo);
                anioLectivo = em.merge(anioLectivo);
            }
            if (docente != null) {
                docente.getGrupoList().add(grupo);
                docente = em.merge(docente);
            }
            for (CargaAcademica cargaAcademicaListCargaAcademica : grupo.getCargaAcademicaList()) {
                Grupo oldGrupoOfCargaAcademicaListCargaAcademica = cargaAcademicaListCargaAcademica.getGrupo();
                cargaAcademicaListCargaAcademica.setGrupo(grupo);
                cargaAcademicaListCargaAcademica = em.merge(cargaAcademicaListCargaAcademica);
                if (oldGrupoOfCargaAcademicaListCargaAcademica != null) {
                    oldGrupoOfCargaAcademicaListCargaAcademica.getCargaAcademicaList().remove(cargaAcademicaListCargaAcademica);
                    oldGrupoOfCargaAcademicaListCargaAcademica = em.merge(oldGrupoOfCargaAcademicaListCargaAcademica);
                }
            }
            for (Matricula matriculaListMatricula : grupo.getMatriculaList()) {
                Grupo oldGrupoOfMatriculaListMatricula = matriculaListMatricula.getGrupo();
                matriculaListMatricula.setGrupo(grupo);
                matriculaListMatricula = em.merge(matriculaListMatricula);
                if (oldGrupoOfMatriculaListMatricula != null) {
                    oldGrupoOfMatriculaListMatricula.getMatriculaList().remove(matriculaListMatricula);
                    oldGrupoOfMatriculaListMatricula = em.merge(oldGrupoOfMatriculaListMatricula);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Grupo grupo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Grupo persistentGrupo = em.find(Grupo.class, grupo.getIdGrupo());
            AnioLectivo anioLectivoOld = persistentGrupo.getAnioLectivo();
            AnioLectivo anioLectivoNew = grupo.getAnioLectivo();
            Docente docenteOld = persistentGrupo.getDocente();
            Docente docenteNew = grupo.getDocente();
            List<CargaAcademica> cargaAcademicaListOld = persistentGrupo.getCargaAcademicaList();
            List<CargaAcademica> cargaAcademicaListNew = grupo.getCargaAcademicaList();
            List<Matricula> matriculaListOld = persistentGrupo.getMatriculaList();
            List<Matricula> matriculaListNew = grupo.getMatriculaList();
            if (anioLectivoNew != null) {
                anioLectivoNew = em.getReference(anioLectivoNew.getClass(), anioLectivoNew.getIdAnioLectivo());
                grupo.setAnioLectivo(anioLectivoNew);
            }
            if (docenteNew != null) {
                docenteNew = em.getReference(docenteNew.getClass(), docenteNew.getIdDocente());
                grupo.setDocente(docenteNew);
            }
            List<CargaAcademica> attachedCargaAcademicaListNew = new ArrayList<CargaAcademica>();
            for (CargaAcademica cargaAcademicaListNewCargaAcademicaToAttach : cargaAcademicaListNew) {
                cargaAcademicaListNewCargaAcademicaToAttach = em.getReference(cargaAcademicaListNewCargaAcademicaToAttach.getClass(), cargaAcademicaListNewCargaAcademicaToAttach.getIdCarga());
                attachedCargaAcademicaListNew.add(cargaAcademicaListNewCargaAcademicaToAttach);
            }
            cargaAcademicaListNew = attachedCargaAcademicaListNew;
            grupo.setCargaAcademicaList(cargaAcademicaListNew);
            List<Matricula> attachedMatriculaListNew = new ArrayList<Matricula>();
            for (Matricula matriculaListNewMatriculaToAttach : matriculaListNew) {
                matriculaListNewMatriculaToAttach = em.getReference(matriculaListNewMatriculaToAttach.getClass(), matriculaListNewMatriculaToAttach.getIdMatricula());
                attachedMatriculaListNew.add(matriculaListNewMatriculaToAttach);
            }
            matriculaListNew = attachedMatriculaListNew;
            grupo.setMatriculaList(matriculaListNew);
            grupo = em.merge(grupo);
            if (anioLectivoOld != null && !anioLectivoOld.equals(anioLectivoNew)) {
                anioLectivoOld.getGrupoList().remove(grupo);
                anioLectivoOld = em.merge(anioLectivoOld);
            }
            if (anioLectivoNew != null && !anioLectivoNew.equals(anioLectivoOld)) {
                anioLectivoNew.getGrupoList().add(grupo);
                anioLectivoNew = em.merge(anioLectivoNew);
            }
            if (docenteOld != null && !docenteOld.equals(docenteNew)) {
                docenteOld.getGrupoList().remove(grupo);
                docenteOld = em.merge(docenteOld);
            }
            if (docenteNew != null && !docenteNew.equals(docenteOld)) {
                docenteNew.getGrupoList().add(grupo);
                docenteNew = em.merge(docenteNew);
            }
            for (CargaAcademica cargaAcademicaListOldCargaAcademica : cargaAcademicaListOld) {
                if (!cargaAcademicaListNew.contains(cargaAcademicaListOldCargaAcademica)) {
                    cargaAcademicaListOldCargaAcademica.setGrupo(null);
                    cargaAcademicaListOldCargaAcademica = em.merge(cargaAcademicaListOldCargaAcademica);
                }
            }
            for (CargaAcademica cargaAcademicaListNewCargaAcademica : cargaAcademicaListNew) {
                if (!cargaAcademicaListOld.contains(cargaAcademicaListNewCargaAcademica)) {
                    Grupo oldGrupoOfCargaAcademicaListNewCargaAcademica = cargaAcademicaListNewCargaAcademica.getGrupo();
                    cargaAcademicaListNewCargaAcademica.setGrupo(grupo);
                    cargaAcademicaListNewCargaAcademica = em.merge(cargaAcademicaListNewCargaAcademica);
                    if (oldGrupoOfCargaAcademicaListNewCargaAcademica != null && !oldGrupoOfCargaAcademicaListNewCargaAcademica.equals(grupo)) {
                        oldGrupoOfCargaAcademicaListNewCargaAcademica.getCargaAcademicaList().remove(cargaAcademicaListNewCargaAcademica);
                        oldGrupoOfCargaAcademicaListNewCargaAcademica = em.merge(oldGrupoOfCargaAcademicaListNewCargaAcademica);
                    }
                }
            }
            for (Matricula matriculaListOldMatricula : matriculaListOld) {
                if (!matriculaListNew.contains(matriculaListOldMatricula)) {
                    matriculaListOldMatricula.setGrupo(null);
                    matriculaListOldMatricula = em.merge(matriculaListOldMatricula);
                }
            }
            for (Matricula matriculaListNewMatricula : matriculaListNew) {
                if (!matriculaListOld.contains(matriculaListNewMatricula)) {
                    Grupo oldGrupoOfMatriculaListNewMatricula = matriculaListNewMatricula.getGrupo();
                    matriculaListNewMatricula.setGrupo(grupo);
                    matriculaListNewMatricula = em.merge(matriculaListNewMatricula);
                    if (oldGrupoOfMatriculaListNewMatricula != null && !oldGrupoOfMatriculaListNewMatricula.equals(grupo)) {
                        oldGrupoOfMatriculaListNewMatricula.getMatriculaList().remove(matriculaListNewMatricula);
                        oldGrupoOfMatriculaListNewMatricula = em.merge(oldGrupoOfMatriculaListNewMatricula);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = grupo.getIdGrupo();
                if (findGrupo(id) == null) {
                    throw new NonexistentEntityException("The grupo with id " + id + " no longer exists.");
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
            Grupo grupo;
            try {
                grupo = em.getReference(Grupo.class, id);
                grupo.getIdGrupo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The grupo with id " + id + " no longer exists.", enfe);
            }
            AnioLectivo anioLectivo = grupo.getAnioLectivo();
            if (anioLectivo != null) {
                anioLectivo.getGrupoList().remove(grupo);
                anioLectivo = em.merge(anioLectivo);
            }
            Docente docente = grupo.getDocente();
            if (docente != null) {
                docente.getGrupoList().remove(grupo);
                docente = em.merge(docente);
            }
            List<CargaAcademica> cargaAcademicaList = grupo.getCargaAcademicaList();
            for (CargaAcademica cargaAcademicaListCargaAcademica : cargaAcademicaList) {
                cargaAcademicaListCargaAcademica.setGrupo(null);
                cargaAcademicaListCargaAcademica = em.merge(cargaAcademicaListCargaAcademica);
            }
            List<Matricula> matriculaList = grupo.getMatriculaList();
            for (Matricula matriculaListMatricula : matriculaList) {
                matriculaListMatricula.setGrupo(null);
                matriculaListMatricula = em.merge(matriculaListMatricula);
            }
            em.remove(grupo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Grupo> findGrupoEntities() {
        return findGrupoEntities(true, -1, -1);
    }

    public List<Grupo> findGrupoEntities(int maxResults, int firstResult) {
        return findGrupoEntities(false, maxResults, firstResult);
    }

    private List<Grupo> findGrupoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Grupo.class));
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

    public Grupo findGrupo(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Grupo.class, id);
        } finally {
            em.close();
        }
    }

    public int getGrupoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Grupo> rt = cq.from(Grupo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
