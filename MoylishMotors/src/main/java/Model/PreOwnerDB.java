/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Jonathan Roddy
 */
public class PreOwnerDB {
    
public static List<PreOwner> getAllPreOwner() {
        EntityManager em = DBUtil.getEMF().createEntityManager();
        List<PreOwner> list = null;
        try {
            list = em.createNamedQuery("PreOwner.findAll")
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
}
