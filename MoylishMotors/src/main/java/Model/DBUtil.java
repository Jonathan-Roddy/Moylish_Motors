/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jonathan Roddy
 */
public class DBUtil {
       private static final EntityManagerFactory EMF = 
            Persistence.createEntityManagerFactory("mm_pu");
     
    public static EntityManagerFactory getEMF() { return EMF; }
    
}
