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
public class CarsDBTest {
    
    public CarsDBTest() {
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
     * Test of getAll method, of class CarsDB.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CarsDB instance = new CarsDB();
        List<Cars> expResult = null;
        List<Cars> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByID method, of class CarsDB.
     */
    @Test
    public void testGetByID() {
        System.out.println("getByID");
        int listingNumber = 4294195;
        CarsDB instance = new CarsDB();
        Optional<Cars> expResult = null;
        Optional<Cars> result = instance.getByID(listingNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CarsDB.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Cars c = null;
        CarsDB instance = new CarsDB();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CarsDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Cars c = null;
        CarsDB instance = new CarsDB();
        instance.delete(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CarsDB.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Cars c = null;
        CarsDB instance = new CarsDB();
        instance.update(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCarsByModel method, of class CarsDB.
     */
    @Test
    public void testGetCarsByModel() {
        System.out.println("getCarsByModel");
        String model = "Opel";
        CarsDB instance = new CarsDB();
        List<Cars> expResult = null;
        List<Cars> result = instance.getCarsByModel(model);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
