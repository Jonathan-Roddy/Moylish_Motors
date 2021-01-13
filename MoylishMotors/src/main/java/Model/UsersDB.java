/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author Jonathan Roddy
 */
public class UsersDB implements UserRepository<Users>{
    
    @Override
    public List<Users> getAll() {

        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        TypedQuery<Users> tq = em.createNamedQuery("Users.findAll", Users.class);
                
        List<Users> list = null;
        try {
            list = tq.getResultList();
            
            if (list == null || list.isEmpty()) {
                list = null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
        return list;
    }

    @Override
    public Optional<Users> getByID(int ID) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        Optional<Users> users= null;
        try {
            users = Optional.ofNullable(em.find(Model.Users.class,ID));
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
        return users;  
    }
    
    @Override
    public void add(Users t) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        EntityTransaction trans = em.getTransaction();
        
        try {
            trans.begin();
            em.persist(t);
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
    }

    @Override
    public void delete(Users t) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        EntityTransaction trans = em.getTransaction();
        
        try {
            trans.begin();
            em.remove(em.merge(t));
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
    }

    @Override
    public void update(Users t) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        EntityTransaction trans = em.getTransaction();
        
        try {
            trans.begin();
            em.merge(t);
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
    }
    
    public List<Users> getUserByUserName(String name){
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        TypedQuery<Users> tq = em.createNamedQuery("Users.findByUsername", Users.class);
        tq.setParameter("name", name);
        List<Users> list = null;
        
        try {
            list = tq.getResultList();
            
//            if (list == null || list.isEmpty()) {
//                list = null;
//            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
        return list;
    }

    
}
