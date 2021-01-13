/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Collection;
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
public class PreOwnerTest {
    
    public PreOwnerTest() {
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
     * Test of getId method, of class PreOwner.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PreOwner instance = new PreOwner();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PreOwner.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        PreOwner instance = new PreOwner();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFullName method, of class PreOwner.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        PreOwner instance = new PreOwner();
        String expResult = "";
        String result = instance.getFullName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFullName method, of class PreOwner.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "";
        PreOwner instance = new PreOwner();
        instance.setFullName(fullName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFullAddress method, of class PreOwner.
     */
    @Test
    public void testGetFullAddress() {
        System.out.println("getFullAddress");
        PreOwner instance = new PreOwner();
        String expResult = "";
        String result = instance.getFullAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFullAddress method, of class PreOwner.
     */
    @Test
    public void testSetFullAddress() {
        System.out.println("setFullAddress");
        String fullAddress = "";
        PreOwner instance = new PreOwner();
        instance.setFullAddress(fullAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class PreOwner.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        PreOwner instance = new PreOwner();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class PreOwner.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        PreOwner instance = new PreOwner();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class PreOwner.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        PreOwner instance = new PreOwner();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PreOwner.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        PreOwner instance = new PreOwner();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PreOwner.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PreOwner instance = new PreOwner();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarsCollection method, of class PreOwner.
     */
    @Test
    public void testGetCarsCollection() {
        System.out.println("getCarsCollection");
        PreOwner instance = new PreOwner();
        Collection<Cars> expResult = null;
        Collection<Cars> result = instance.getCarsCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarsCollection method, of class PreOwner.
     */
    @Test
    public void testSetCarsCollection() {
        System.out.println("setCarsCollection");
        Collection<Cars> carsCollection = null;
        PreOwner instance = new PreOwner();
        instance.setCarsCollection(carsCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
