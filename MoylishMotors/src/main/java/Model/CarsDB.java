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
public class CarsDB implements CarRepository<Cars>{
    @Override
    public List<Cars> getAll() {

        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        TypedQuery<Cars> tq = em.createNamedQuery("Cars.findAll", Cars.class);
                
        List<Cars> list = null;
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
    public Optional<Cars> getByID(int listingNumber) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        Optional<Cars> cars= null;
        try {
            cars = Optional.ofNullable(em.find(Model.Cars.class,listingNumber));
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
        return cars;  
    }

    @Override
    public void add(Cars c) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        EntityTransaction trans = em.getTransaction();
        
        try {
            trans.begin();
            em.persist(c);
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
    }

    @Override
    public void delete(Cars c) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        EntityTransaction trans = em.getTransaction();
        
        try {
            trans.begin();
            em.remove(em.merge(c));
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
    }

    @Override
    public void update(Cars c) {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        EntityTransaction trans = em.getTransaction();
        
        try {
            trans.begin();
            em.merge(c);
            trans.commit();
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.clear();
        }
    }
    
    public List<Cars> getCarsByModel(String model){
        EntityManager em = DBUtil.getEMF().createEntityManager();
        
        TypedQuery<Cars> tq = em.createNamedQuery("Cars.findByModel", Cars.class);
        tq.setParameter("model", model);
        List<Cars> list = null;
        
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
