/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.datos;

import djk.procesardkj.datos.exceptions.NonexistentEntityException;
import djk.procesardkj.domain.Config;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author ENOR ACOSTA
 */
public class ConfigJpaController implements Serializable {

    public ConfigJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public ConfigJpaController() {
        this.emf = Persistence.createEntityManagerFactory("djk_ProcesarDKJ_jar_1.0PU");
    }

    public void create(Config config) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(config);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Config config) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            config = em.merge(config);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = config.getId();
                if (findConfig(id) == null) {
                    throw new NonexistentEntityException("The config with id " + id + " no longer exists.");
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
            Config config;
            try {
                config = em.getReference(Config.class, id);
                config.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The config with id " + id + " no longer exists.", enfe);
            }
            em.remove(config);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Config> findConfigEntities() {
        return findConfigEntities(true, -1, -1);
    }

    public List<Config> findConfigEntities(int maxResults, int firstResult) {
        return findConfigEntities(false, maxResults, firstResult);
    }

    private List<Config> findConfigEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Config.class));
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

    public Config findConfig(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Config.class, id);
        } finally {
            em.close();
        }
    }

    public int getConfigCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Config> rt = cq.from(Config.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public Config findByInstitucion() throws Exception{
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Config> consulta = em.createNamedQuery("Config.findByClave", Config.class);
            consulta.setParameter("clave", "nombreInstitucion");
            return consulta.getSingleResult();
        }catch(Exception ex){
            throw new Exception("Pendiente", ex);
        }
        finally {
            em.close();
        }
    }
    
}
