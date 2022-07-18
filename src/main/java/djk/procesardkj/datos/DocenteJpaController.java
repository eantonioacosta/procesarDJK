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
import djk.procesardkj.domain.Usuario;
import djk.procesardkj.domain.Grupo;
import java.util.ArrayList;
import java.util.List;
import djk.procesardkj.domain.CargaAcademica;
import djk.procesardkj.domain.Docente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author ENOR ACOSTA
 */
public class DocenteJpaController implements Serializable {

    public DocenteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public DocenteJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Docente docente) {
        if (docente.getGrupoList() == null) {
            docente.setGrupoList(new ArrayList<Grupo>());
        }
        if (docente.getCargaAcademicaList() == null) {
            docente.setCargaAcademicaList(new ArrayList<CargaAcademica>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario usuario = docente.getUsuario();
            if (usuario != null) {
                usuario = em.getReference(usuario.getClass(), usuario.getCodigo());
                docente.setUsuario(usuario);
            }
            List<Grupo> attachedGrupoList = new ArrayList<Grupo>();
            for (Grupo grupoListGrupoToAttach : docente.getGrupoList()) {
                grupoListGrupoToAttach = em.getReference(grupoListGrupoToAttach.getClass(), grupoListGrupoToAttach.getIdGrupo());
                attachedGrupoList.add(grupoListGrupoToAttach);
            }
            docente.setGrupoList(attachedGrupoList);
            List<CargaAcademica> attachedCargaAcademicaList = new ArrayList<CargaAcademica>();
            for (CargaAcademica cargaAcademicaListCargaAcademicaToAttach : docente.getCargaAcademicaList()) {
                cargaAcademicaListCargaAcademicaToAttach = em.getReference(cargaAcademicaListCargaAcademicaToAttach.getClass(), cargaAcademicaListCargaAcademicaToAttach.getIdCarga());
                attachedCargaAcademicaList.add(cargaAcademicaListCargaAcademicaToAttach);
            }
            docente.setCargaAcademicaList(attachedCargaAcademicaList);
            em.persist(docente);
            if (usuario != null) {
                Docente oldDocenteOfUsuario = usuario.getDocente();
                if (oldDocenteOfUsuario != null) {
                    oldDocenteOfUsuario.setUsuario(null);
                    oldDocenteOfUsuario = em.merge(oldDocenteOfUsuario);
                }
                usuario.setDocente(docente);
                usuario = em.merge(usuario);
            }
            for (Grupo grupoListGrupo : docente.getGrupoList()) {
                Docente oldDocenteOfGrupoListGrupo = grupoListGrupo.getDocente();
                grupoListGrupo.setDocente(docente);
                grupoListGrupo = em.merge(grupoListGrupo);
                if (oldDocenteOfGrupoListGrupo != null) {
                    oldDocenteOfGrupoListGrupo.getGrupoList().remove(grupoListGrupo);
                    oldDocenteOfGrupoListGrupo = em.merge(oldDocenteOfGrupoListGrupo);
                }
            }
            for (CargaAcademica cargaAcademicaListCargaAcademica : docente.getCargaAcademicaList()) {
                Docente oldDocenteOfCargaAcademicaListCargaAcademica = cargaAcademicaListCargaAcademica.getDocente();
                cargaAcademicaListCargaAcademica.setDocente(docente);
                cargaAcademicaListCargaAcademica = em.merge(cargaAcademicaListCargaAcademica);
                if (oldDocenteOfCargaAcademicaListCargaAcademica != null) {
                    oldDocenteOfCargaAcademicaListCargaAcademica.getCargaAcademicaList().remove(cargaAcademicaListCargaAcademica);
                    oldDocenteOfCargaAcademicaListCargaAcademica = em.merge(oldDocenteOfCargaAcademicaListCargaAcademica);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Docente docente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Docente persistentDocente = em.find(Docente.class, docente.getIdDocente());
            Usuario usuarioOld = persistentDocente.getUsuario();
            Usuario usuarioNew = docente.getUsuario();
            List<Grupo> grupoListOld = persistentDocente.getGrupoList();
            List<Grupo> grupoListNew = docente.getGrupoList();
            List<CargaAcademica> cargaAcademicaListOld = persistentDocente.getCargaAcademicaList();
            List<CargaAcademica> cargaAcademicaListNew = docente.getCargaAcademicaList();
            if (usuarioNew != null) {
                usuarioNew = em.getReference(usuarioNew.getClass(), usuarioNew.getCodigo());
                docente.setUsuario(usuarioNew);
            }
            List<Grupo> attachedGrupoListNew = new ArrayList<Grupo>();
            for (Grupo grupoListNewGrupoToAttach : grupoListNew) {
                grupoListNewGrupoToAttach = em.getReference(grupoListNewGrupoToAttach.getClass(), grupoListNewGrupoToAttach.getIdGrupo());
                attachedGrupoListNew.add(grupoListNewGrupoToAttach);
            }
            grupoListNew = attachedGrupoListNew;
            docente.setGrupoList(grupoListNew);
            List<CargaAcademica> attachedCargaAcademicaListNew = new ArrayList<CargaAcademica>();
            for (CargaAcademica cargaAcademicaListNewCargaAcademicaToAttach : cargaAcademicaListNew) {
                cargaAcademicaListNewCargaAcademicaToAttach = em.getReference(cargaAcademicaListNewCargaAcademicaToAttach.getClass(), cargaAcademicaListNewCargaAcademicaToAttach.getIdCarga());
                attachedCargaAcademicaListNew.add(cargaAcademicaListNewCargaAcademicaToAttach);
            }
            cargaAcademicaListNew = attachedCargaAcademicaListNew;
            docente.setCargaAcademicaList(cargaAcademicaListNew);
            docente = em.merge(docente);
            if (usuarioOld != null && !usuarioOld.equals(usuarioNew)) {
                usuarioOld.setDocente(null);
                usuarioOld = em.merge(usuarioOld);
            }
            if (usuarioNew != null && !usuarioNew.equals(usuarioOld)) {
                Docente oldDocenteOfUsuario = usuarioNew.getDocente();
                if (oldDocenteOfUsuario != null) {
                    oldDocenteOfUsuario.setUsuario(null);
                    oldDocenteOfUsuario = em.merge(oldDocenteOfUsuario);
                }
                usuarioNew.setDocente(docente);
                usuarioNew = em.merge(usuarioNew);
            }
            for (Grupo grupoListOldGrupo : grupoListOld) {
                if (!grupoListNew.contains(grupoListOldGrupo)) {
                    grupoListOldGrupo.setDocente(null);
                    grupoListOldGrupo = em.merge(grupoListOldGrupo);
                }
            }
            for (Grupo grupoListNewGrupo : grupoListNew) {
                if (!grupoListOld.contains(grupoListNewGrupo)) {
                    Docente oldDocenteOfGrupoListNewGrupo = grupoListNewGrupo.getDocente();
                    grupoListNewGrupo.setDocente(docente);
                    grupoListNewGrupo = em.merge(grupoListNewGrupo);
                    if (oldDocenteOfGrupoListNewGrupo != null && !oldDocenteOfGrupoListNewGrupo.equals(docente)) {
                        oldDocenteOfGrupoListNewGrupo.getGrupoList().remove(grupoListNewGrupo);
                        oldDocenteOfGrupoListNewGrupo = em.merge(oldDocenteOfGrupoListNewGrupo);
                    }
                }
            }
            for (CargaAcademica cargaAcademicaListOldCargaAcademica : cargaAcademicaListOld) {
                if (!cargaAcademicaListNew.contains(cargaAcademicaListOldCargaAcademica)) {
                    cargaAcademicaListOldCargaAcademica.setDocente(null);
                    cargaAcademicaListOldCargaAcademica = em.merge(cargaAcademicaListOldCargaAcademica);
                }
            }
            for (CargaAcademica cargaAcademicaListNewCargaAcademica : cargaAcademicaListNew) {
                if (!cargaAcademicaListOld.contains(cargaAcademicaListNewCargaAcademica)) {
                    Docente oldDocenteOfCargaAcademicaListNewCargaAcademica = cargaAcademicaListNewCargaAcademica.getDocente();
                    cargaAcademicaListNewCargaAcademica.setDocente(docente);
                    cargaAcademicaListNewCargaAcademica = em.merge(cargaAcademicaListNewCargaAcademica);
                    if (oldDocenteOfCargaAcademicaListNewCargaAcademica != null && !oldDocenteOfCargaAcademicaListNewCargaAcademica.equals(docente)) {
                        oldDocenteOfCargaAcademicaListNewCargaAcademica.getCargaAcademicaList().remove(cargaAcademicaListNewCargaAcademica);
                        oldDocenteOfCargaAcademicaListNewCargaAcademica = em.merge(oldDocenteOfCargaAcademicaListNewCargaAcademica);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = docente.getIdDocente();
                if (findDocente(id) == null) {
                    throw new NonexistentEntityException("The docente with id " + id + " no longer exists.");
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
            Docente docente;
            try {
                docente = em.getReference(Docente.class, id);
                docente.getIdDocente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The docente with id " + id + " no longer exists.", enfe);
            }
            Usuario usuario = docente.getUsuario();
            if (usuario != null) {
                usuario.setDocente(null);
                usuario = em.merge(usuario);
            }
            List<Grupo> grupoList = docente.getGrupoList();
            for (Grupo grupoListGrupo : grupoList) {
                grupoListGrupo.setDocente(null);
                grupoListGrupo = em.merge(grupoListGrupo);
            }
            List<CargaAcademica> cargaAcademicaList = docente.getCargaAcademicaList();
            for (CargaAcademica cargaAcademicaListCargaAcademica : cargaAcademicaList) {
                cargaAcademicaListCargaAcademica.setDocente(null);
                cargaAcademicaListCargaAcademica = em.merge(cargaAcademicaListCargaAcademica);
            }
            em.remove(docente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Docente> findDocenteEntities() {
        return findDocenteEntities(true, -1, -1);
    }

    public List<Docente> findDocenteEntities(int maxResults, int firstResult) {
        return findDocenteEntities(false, maxResults, firstResult);
    }

    private List<Docente> findDocenteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Docente.class));
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

    public Docente findDocente(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Docente.class, id);
        } finally {
            em.close();
        }
    }

    public int getDocenteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Docente> rt = cq.from(Docente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
        public List<Docente> findEstudianteByEstado(int estado) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Docente> consulta = em.createNamedQuery("Docente.findByEstado", Docente.class);
            consulta.setParameter("estado", estado);
            return consulta.getResultList();
        } finally {
            em.close();
        }
    }
    
}
