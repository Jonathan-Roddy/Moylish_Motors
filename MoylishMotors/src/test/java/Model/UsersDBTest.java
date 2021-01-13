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
public class UsersDBTest {
    
    public UsersDBTest() {
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
     * Test of getAll method, of class UsersDB.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        UsersDB instance = new UsersDB();
        //List<Users> expResult = ("1", "Jonathan", "9F86D081884C7D659A2FEAA0C55AD015A3BF4F1B2B0B822CD15D6C15B0F00A08", "admin");
        List<Users> result = instance.getAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByID method, of class UsersDB.
     */
//    @Test
//    public void testGetByID() {
//        System.out.println("getByID");
//        int ID = 0;
//        UsersDB instance = new UsersDB();
//        Optional<Users> expResult = null;
//        Optional<Users> result = instance.getByID(ID);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
    //    @Ignore
    @Test
    public void testGetByID() {
        
        int id = 55;
        String name = "JUNIT";
        UsersDB instance = new UsersDB();
        Users aUser = new Users(id, name,"aPassword", "admin");
        instance.add(aUser);
        
        Optional<Users> s = instance.getByID(id);
        Users result = s.orElse(new Users());
        instance.delete(aUser);
        
        assertEquals(name, result.getUsername());
    }

    /**
     * Test of add method, of class UsersDB.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Users t = null;
        UsersDB instance = new UsersDB();
        instance.add(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UsersDB.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Users t = null;
        UsersDB instance = new UsersDB();
        instance.delete(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UsersDB.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Users t = null;
        UsersDB instance = new UsersDB();
        instance.update(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByUserName method, of class UsersDB.
     */
    @Test
    public void testGetUserByUserName() {
        System.out.println("getUserByUserName");
        String name = "";
        UsersDB instance = new UsersDB();
        List<Users> expResult = null;
        List<Users> result = instance.getUserByUserName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
