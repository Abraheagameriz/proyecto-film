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
public class CPeliculasIT {
    
    public CPeliculasIT() {
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
     * Test of getID method, of class CPeliculas.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        CPeliculas instance = new CPeliculas();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class CPeliculas.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        CPeliculas instance = new CPeliculas();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class CPeliculas.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        CPeliculas instance = new CPeliculas();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNacionalidad method, of class CPeliculas.
     */
    @Test
    public void testGetNacionalidad() {
        System.out.println("getNacionalidad");
        CPeliculas instance = new CPeliculas();
        String expResult = "";
        String result = instance.getNacionalidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductora method, of class CPeliculas.
     */
    @Test
    public void testGetProductora() {
        System.out.println("getProductora");
        CPeliculas instance = new CPeliculas();
        String expResult = "";
        String result = instance.getProductora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class CPeliculas.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        CPeliculas instance = new CPeliculas();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class CPeliculas.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String Titulo = "";
        CPeliculas instance = new CPeliculas();
        instance.setTitulo(Titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNacionalidad method, of class CPeliculas.
     */
    @Test
    public void testSetNacionalidad() {
        System.out.println("setNacionalidad");
        String Nacionalidad = "";
        CPeliculas instance = new CPeliculas();
        instance.setNacionalidad(Nacionalidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductora method, of class CPeliculas.
     */
    @Test
    public void testSetProductora() {
        System.out.println("setProductora");
        String Productora = "";
        CPeliculas instance = new CPeliculas();
        instance.setProductora(Productora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class CPeliculas.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String Fecha = "";
        CPeliculas instance = new CPeliculas();
        instance.setFecha(Fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
