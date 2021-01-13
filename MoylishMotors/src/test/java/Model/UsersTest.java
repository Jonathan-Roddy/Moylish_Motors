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
public class UsersTest {
    
    public UsersTest() {
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
     * Test of getId method, of class Users.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Users instance = new Users();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Users.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Users instance = new Users();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Users.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Users.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Users instance = new Users();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Users.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Users.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Users instance = new Users();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserType method, of class Users.
     */
    @Test
    public void testGetUserType() {
        System.out.println("getUserType");
        Users instance = new Users();
        String expResult = "";
        String result = instance.getUserType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserType method, of class Users.
     */
    @Test
    public void testSetUserType() {
        System.out.println("setUserType");
        String userType = "";
        Users instance = new Users();
        instance.setUserType(userType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarArchiveCollection method, of class Users.
     */
    @Test
    public void testGetCarArchiveCollection() {
        System.out.println("getCarArchiveCollection");
        Users instance = new Users();
        Collection<CarArchive> expResult = null;
        Collection<CarArchive> result = instance.getCarArchiveCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarArchiveCollection method, of class Users.
     */
    @Test
    public void testSetCarArchiveCollection() {
        System.out.println("setCarArchiveCollection");
        Collection<CarArchive> carArchiveCollection = null;
        Users instance = new Users();
        instance.setCarArchiveCollection(carArchiveCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavourites method, of class Users.
     */
    @Test
    public void testGetFavourites() {
        System.out.println("getFavourites");
        Users instance = new Users();
        Favourites expResult = null;
        Favourites result = instance.getFavourites();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavourites method, of class Users.
     */
    @Test
    public void testSetFavourites() {
        System.out.println("setFavourites");
        Favourites favourites = null;
        Users instance = new Users();
        instance.setFavourites(favourites);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVendor method, of class Users.
     */
    @Test
    public void testGetVendor() {
        System.out.println("getVendor");
        Users instance = new Users();
        Vendor expResult = null;
        Vendor result = instance.getVendor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVendor method, of class Users.
     */
    @Test
    public void testSetVendor() {
        System.out.println("setVendor");
        Vendor vendor = null;
        Users instance = new Users();
        instance.setVendor(vendor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Users.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Users instance = new Users();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Users.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Users instance = new Users();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Users.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Users instance = new Users();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
