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
public class VendorDB implements VendorRepository<Vendor>{
     
    
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

    @Override
    public List<Vendor> getAll() {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        List<Vendor> list = null;
        try {
            list = em.createNamedQuery("Vendor.findAll")
                    .getResultList();
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
    public void add(Vendor t) {
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
    public void delete(Vendor t) {
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
    public void update(Vendor t) {
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

    @Override
    public Optional<Vendor> getByID(int id) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        Optional<Vendor> vendors= null;
        try {
            vendors = Optional.ofNullable(em.find(Model.Vendor.class,id));
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
        return vendors;  
    }

    
}
