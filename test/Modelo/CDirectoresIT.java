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
public class CDirectoresIT {
    
    public CDirectoresIT() {
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
     * Test of getID method, of class CDirectores.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        CDirectores instance = new CDirectores();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class CDirectores.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        CDirectores instance = new CDirectores();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CDirectores.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CDirectores instance = new CDirectores();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class CDirectores.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        CDirectores instance = new CDirectores();
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNacionalidad method, of class CDirectores.
     */
    @Test
    public void testGetNacionalidad() {
        System.out.println("getNacionalidad");
        CDirectores instance = new CDirectores();
        String expResult = "";
        String result = instance.getNacionalidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNacionalidad method, of class CDirectores.
     */
    @Test
    public void testSetNacionalidad() {
        System.out.println("setNacionalidad");
        String Nacionalidad = "";
        CDirectores instance = new CDirectores();
        instance.setNacionalidad(Nacionalidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPelicula method, of class CDirectores.
     */
    @Test
    public void testGetPelicula() {
        System.out.println("getPelicula");
        CDirectores instance = new CDirectores();
        String expResult = "";
        String result = instance.getPelicula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPelicula method, of class CDirectores.
     */
    @Test
    public void testSetPelicula() {
        System.out.println("setPelicula");
        String Pelicula = "";
        CDirectores instance = new CDirectores();
        instance.setPelicula(Pelicula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
