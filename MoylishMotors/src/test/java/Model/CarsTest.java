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
public class CarsTest {
    
    public CarsTest() {
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
     * Test of getListingNumber method, of class Cars.
     */
    @Test
    public void testGetListingNumber() {
        System.out.println("getListingNumber");
        Cars instance = new Cars();
        Integer expResult = null;
        Integer result = instance.getListingNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListingNumber method, of class Cars.
     */
    @Test
    public void testSetListingNumber() {
        System.out.println("setListingNumber");
        Integer listingNumber = null;
        Cars instance = new Cars();
        instance.setListingNumber(listingNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class Cars.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Cars instance = new Cars();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class Cars.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        Cars instance = new Cars();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReg method, of class Cars.
     */
    @Test
    public void testGetReg() {
        System.out.println("getReg");
        Cars instance = new Cars();
        int expResult = 0;
        int result = instance.getReg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReg method, of class Cars.
     */
    @Test
    public void testSetReg() {
        System.out.println("setReg");
        int reg = 0;
        Cars instance = new Cars();
        instance.setReg(reg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMake method, of class Cars.
     */
    @Test
    public void testGetMake() {
        System.out.println("getMake");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getMake();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMake method, of class Cars.
     */
    @Test
    public void testSetMake() {
        System.out.println("setMake");
        String make = "";
        Cars instance = new Cars();
        instance.setMake(make);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class Cars.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class Cars.
     */
    @Test
    public void testSetModel() {
        System.out.println("setModel");
        String model = "";
        Cars instance = new Cars();
        instance.setModel(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColour method, of class Cars.
     */
    @Test
    public void testGetColour() {
        System.out.println("getColour");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColour method, of class Cars.
     */
    @Test
    public void testSetColour() {
        System.out.println("setColour");
        String colour = "";
        Cars instance = new Cars();
        instance.setColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Cars.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Cars.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Cars instance = new Cars();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuyPrice method, of class Cars.
     */
    @Test
    public void testGetBuyPrice() {
        System.out.println("getBuyPrice");
        Cars instance = new Cars();
        int expResult = 0;
        int result = instance.getBuyPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuyPrice method, of class Cars.
     */
    @Test
    public void testSetBuyPrice_int() {
        System.out.println("setBuyPrice");
        int buyPrice = 0;
        Cars instance = new Cars();
        instance.setBuyPrice(buyPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListPrice method, of class Cars.
     */
    @Test
    public void testGetListPrice() {
        System.out.println("getListPrice");
        Cars instance = new Cars();
        int expResult = 0;
        int result = instance.getListPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListPrice method, of class Cars.
     */
    @Test
    public void testSetListPrice_int() {
        System.out.println("setListPrice");
        int listPrice = 0;
        Cars instance = new Cars();
        instance.setListPrice(listPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOdometer method, of class Cars.
     */
    @Test
    public void testGetOdometer() {
        System.out.println("getOdometer");
        Cars instance = new Cars();
        int expResult = 0;
        int result = instance.getOdometer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOdometer method, of class Cars.
     */
    @Test
    public void testSetOdometer() {
        System.out.println("setOdometer");
        int odometer = 0;
        Cars instance = new Cars();
        instance.setOdometer(odometer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKph method, of class Cars.
     */
    @Test
    public void testGetKph() {
        System.out.println("getKph");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getKph();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKph method, of class Cars.
     */
    @Test
    public void testSetKph() {
        System.out.println("setKph");
        String kph = "";
        Cars instance = new Cars();
        instance.setKph(kph);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEngine method, of class Cars.
     */
    @Test
    public void testGetEngine() {
        System.out.println("getEngine");
        Cars instance = new Cars();
        double expResult = 0.0;
        double result = instance.getEngine();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEngine method, of class Cars.
     */
    @Test
    public void testSetEngine() {
        System.out.println("setEngine");
        double engine = 0.0;
        Cars instance = new Cars();
        instance.setEngine(engine);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuel method, of class Cars.
     */
    @Test
    public void testGetFuel() {
        System.out.println("getFuel");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getFuel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFuel method, of class Cars.
     */
    @Test
    public void testSetFuel() {
        System.out.println("setFuel");
        String fuel = "";
        Cars instance = new Cars();
        instance.setFuel(fuel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransmission method, of class Cars.
     */
    @Test
    public void testGetTransmission() {
        System.out.println("getTransmission");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getTransmission();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransmission method, of class Cars.
     */
    @Test
    public void testSetTransmission() {
        System.out.println("setTransmission");
        String transmission = "";
        Cars instance = new Cars();
        instance.setTransmission(transmission);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBody method, of class Cars.
     */
    @Test
    public void testGetBody() {
        System.out.println("getBody");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getBody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBody method, of class Cars.
     */
    @Test
    public void testSetBody() {
        System.out.println("setBody");
        String body = "";
        Cars instance = new Cars();
        instance.setBody(body);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsofix method, of class Cars.
     */
    @Test
    public void testGetIsofix() {
        System.out.println("getIsofix");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getIsofix();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsofix method, of class Cars.
     */
    @Test
    public void testSetIsofix() {
        System.out.println("setIsofix");
        String isofix = "";
        Cars instance = new Cars();
        instance.setIsofix(isofix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotorTax method, of class Cars.
     */
    @Test
    public void testGetMotorTax() {
        System.out.println("getMotorTax");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getMotorTax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotorTax method, of class Cars.
     */
    @Test
    public void testSetMotorTax() {
        System.out.println("setMotorTax");
        String motorTax = "";
        Cars instance = new Cars();
        instance.setMotorTax(motorTax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreOwnerNumber method, of class Cars.
     */
    @Test
    public void testGetPreOwnerNumber() {
        System.out.println("getPreOwnerNumber");
        Cars instance = new Cars();
        int expResult = 0;
        int result = instance.getPreOwnerNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreOwnerNumber method, of class Cars.
     */
    @Test
    public void testSetPreOwnerNumber() {
        System.out.println("setPreOwnerNumber");
        int preOwnerNumber = 0;
        Cars instance = new Cars();
        instance.setPreOwnerNumber(preOwnerNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFullServiceHistory method, of class Cars.
     */
    @Test
    public void testGetFullServiceHistory() {
        System.out.println("getFullServiceHistory");
        Cars instance = new Cars();
        Character expResult = null;
        Character result = instance.getFullServiceHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFullServiceHistory method, of class Cars.
     */
    @Test
    public void testSetFullServiceHistory() {
        System.out.println("setFullServiceHistory");
        Character fullServiceHistory = null;
        Cars instance = new Cars();
        instance.setFullServiceHistory(fullServiceHistory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNote method, of class Cars.
     */
    @Test
    public void testGetNote() {
        System.out.println("getNote");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.getNote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNote method, of class Cars.
     */
    @Test
    public void testSetNote() {
        System.out.println("setNote");
        String note = "";
        Cars instance = new Cars();
        instance.setNote(note);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarArchive method, of class Cars.
     */
    @Test
    public void testGetCarArchive() {
        System.out.println("getCarArchive");
        Cars instance = new Cars();
        CarArchive expResult = null;
        CarArchive result = instance.getCarArchive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarArchive method, of class Cars.
     */
    @Test
    public void testSetCarArchive() {
        System.out.println("setCarArchive");
        CarArchive carArchive = null;
        Cars instance = new Cars();
        instance.setCarArchive(carArchive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalesPersonID method, of class Cars.
     */
    @Test
    public void testGetSalesPersonID() {
        System.out.println("getSalesPersonID");
        Cars instance = new Cars();
        Vendor expResult = null;
        Vendor result = instance.getSalesPersonID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalesPersonID method, of class Cars.
     */
    @Test
    public void testSetSalesPersonID() {
        System.out.println("setSalesPersonID");
        Vendor salesPersonID = null;
        Cars instance = new Cars();
        instance.setSalesPersonID(salesPersonID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreOwnerID method, of class Cars.
     */
    @Test
    public void testGetPreOwnerID() {
        System.out.println("getPreOwnerID");
        Cars instance = new Cars();
        PreOwner expResult = null;
        PreOwner result = instance.getPreOwnerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreOwnerID method, of class Cars.
     */
    @Test
    public void testSetPreOwnerID() {
        System.out.println("setPreOwnerID");
        PreOwner preOwnerID = null;
        Cars instance = new Cars();
        instance.setPreOwnerID(preOwnerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavouritesCollection method, of class Cars.
     */
    @Test
    public void testGetFavouritesCollection() {
        System.out.println("getFavouritesCollection");
        Cars instance = new Cars();
        Collection<Favourites> expResult = null;
        Collection<Favourites> result = instance.getFavouritesCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavouritesCollection method, of class Cars.
     */
    @Test
    public void testSetFavouritesCollection() {
        System.out.println("setFavouritesCollection");
        Collection<Favourites> favouritesCollection = null;
        Cars instance = new Cars();
        instance.setFavouritesCollection(favouritesCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Cars.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Cars instance = new Cars();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Cars.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Cars instance = new Cars();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cars.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cars instance = new Cars();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBuyPrice method, of class Cars.
     */
    @Test
    public void testSetBuyPrice_double() {
        System.out.println("setBuyPrice");
        double buyPrice = 0.0;
        Cars instance = new Cars();
        instance.setBuyPrice(buyPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListPrice method, of class Cars.
     */
    @Test
    public void testSetListPrice_double() {
        System.out.println("setListPrice");
        double listPrice = 0.0;
        Cars instance = new Cars();
        instance.setListPrice(listPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
