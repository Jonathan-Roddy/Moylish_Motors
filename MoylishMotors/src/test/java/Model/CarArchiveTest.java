/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
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
public class CarArchiveTest {
    
    public CarArchiveTest() {
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
     * Test of getCarID method, of class CarArchive.
     */
    @Test
    public void testGetCarID() {
        System.out.println("getCarID");
        CarArchive instance = new CarArchive();
        Integer expResult = null;
        Integer result = instance.getCarID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarID method, of class CarArchive.
     */
    @Test
    public void testSetCarID() {
        System.out.println("setCarID");
        Integer carID = null;
        CarArchive instance = new CarArchive();
        instance.setCarID(carID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSellPrice method, of class CarArchive.
     */
    @Test
    public void testGetSellPrice() {
        System.out.println("getSellPrice");
        CarArchive instance = new CarArchive();
        int expResult = 0;
        int result = instance.getSellPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSellPrice method, of class CarArchive.
     */
    @Test
    public void testSetSellPrice() {
        System.out.println("setSellPrice");
        int sellPrice = 0;
        CarArchive instance = new CarArchive();
        instance.setSellPrice(sellPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWarranty method, of class CarArchive.
     */
    @Test
    public void testGetWarranty() {
        System.out.println("getWarranty");
        CarArchive instance = new CarArchive();
        String expResult = "";
        String result = instance.getWarranty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWarranty method, of class CarArchive.
     */
    @Test
    public void testSetWarranty() {
        System.out.println("setWarranty");
        String warranty = "";
        CarArchive instance = new CarArchive();
        instance.setWarranty(warranty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateSold method, of class CarArchive.
     */
    @Test
    public void testGetDateSold() {
        System.out.println("getDateSold");
        CarArchive instance = new CarArchive();
        Date expResult = null;
        Date result = instance.getDateSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateSold method, of class CarArchive.
     */
    @Test
    public void testSetDateSold() {
        System.out.println("setDateSold");
        Date dateSold = null;
        CarArchive instance = new CarArchive();
        instance.setDateSold(dateSold);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCars method, of class CarArchive.
     */
    @Test
    public void testGetCars() {
        System.out.println("getCars");
        CarArchive instance = new CarArchive();
        Cars expResult = null;
        Cars result = instance.getCars();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCars method, of class CarArchive.
     */
    @Test
    public void testSetCars() {
        System.out.println("setCars");
        Cars cars = null;
        CarArchive instance = new CarArchive();
        instance.setCars(cars);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendorId method, of class CarArchive.
     */
    @Test
    public void testGetVendorId() {
        System.out.println("getVendorId");
        CarArchive instance = new CarArchive();
        Vendor expResult = null;
        Vendor result = instance.getVendorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendorId method, of class CarArchive.
     */
    @Test
    public void testSetVendorId() {
        System.out.println("setVendorId");
        Vendor vendorId = null;
        CarArchive instance = new CarArchive();
        instance.setVendorId(vendorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerID method, of class CarArchive.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        CarArchive instance = new CarArchive();
        Users expResult = null;
        Users result = instance.getCustomerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerID method, of class CarArchive.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        Users customerID = null;
        CarArchive instance = new CarArchive();
        instance.setCustomerID(customerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class CarArchive.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        CarArchive instance = new CarArchive();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class CarArchive.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        CarArchive instance = new CarArchive();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CarArchive.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CarArchive instance = new CarArchive();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
