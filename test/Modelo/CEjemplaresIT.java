/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sonic
 */
public class CEjemplaresIT {
    
    public CEjemplaresIT() {
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
     * Test of getID method, of class CEjemplares.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        CEjemplares instance = new CEjemplares();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class CEjemplares.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        CEjemplares instance = new CEjemplares();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPelicula method, of class CEjemplares.
     */
    @Test
    public void testGetPelicula() {
        System.out.println("getPelicula");
        CEjemplares instance = new CEjemplares();
        String expResult = "";
        String result = instance.getPelicula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPelicula method, of class CEjemplares.
     */
    @Test
    public void testSetPelicula() {
        System.out.println("setPelicula");
        String Pelicula = "";
        CEjemplares instance = new CEjemplares();
        instance.setPelicula(Pelicula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConservacion method, of class CEjemplares.
     */
    @Test
    public void testGetConservacion() {
        System.out.println("getConservacion");
        CEjemplares instance = new CEjemplares();
        String expResult = "";
        String result = instance.getConservacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConservacion method, of class CEjemplares.
     */
    @Test
    public void testSetConservacion() {
        System.out.println("setConservacion");
        String Conservacion = "";
        CEjemplares instance = new CEjemplares();
        instance.setConservacion(Conservacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class CEjemplares.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        CEjemplares instance = new CEjemplares();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class CEjemplares.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String Status = "";
        CEjemplares instance = new CEjemplares();
        instance.setStatus(Status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
