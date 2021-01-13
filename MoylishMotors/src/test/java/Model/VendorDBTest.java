/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.Optional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan Roddy
 */
public class VendorDBTest {
    
    public VendorDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUserByUserName method, of class VendorDB.
     */
    @Test
    public void testGetUserByUserName() {
        System.out.println("getUserByUserName");
        String name = "";
        VendorDB instance = new VendorDB();
        List<Users> expResult = null;
        List<Users> result = instance.getUserByUserName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class VendorDB.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        VendorDB instance = new VendorDB();
        List<Vendor> expResult = null;
        List<Vendor> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class VendorDB.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vendor t = null;
        VendorDB instance = new VendorDB();
        instance.add(t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class VendorDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Vendor t = null;
        VendorDB instance = new VendorDB();
        instance.delete(t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class VendorDB.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Vendor t = null;
        VendorDB instance = new VendorDB();
        instance.update(t);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByID method, of class VendorDB.
     */
    @Test
    public void testGetByID() {
        System.out.println("getByID");
        
        int id = 1;
//        String name = "Hammer";
        VendorDB instance = new VendorDB();
        //Vendor aUser = new Vendor(1, "Jonathan Roddy","061 208209", "jonathan@mail.com", "2005");
//        instance.add(aUser);
        
        Optional<Vendor> s = instance.getByID(1);
        Vendor result = s.orElse(new Vendor());
        //instance.delete(aUser);
        //assertEquals(id, result.getId());
    }
    
    
    
}
