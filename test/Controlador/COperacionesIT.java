/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.DefaultListModel;
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
public class COperacionesIT {
    
    public COperacionesIT() {
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
     * Test of insertar method, of class COperaciones.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Object ob = null;
        COperaciones instance = new COperaciones();
        instance.insertar(ob);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertarcliente method, of class COperaciones.
     */
    @Test
    public void testInsertarcliente() {
        System.out.println("insertarcliente");
        Object ob = null;
        COperaciones instance = new COperaciones();
        instance.insertarcliente(ob);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClientesNeo method, of class COperaciones.
     */
    @Test
    public void testGetClientesNeo() {
        System.out.println("getClientesNeo");
        COperaciones instance = new COperaciones();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.getClientesNeo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getexClientesNeo method, of class COperaciones.
     */
    @Test
    public void testGetexClientesNeo() {
        System.out.println("getexClientesNeo");
        COperaciones instance = new COperaciones();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.getexClientesNeo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerpeliculaNeo method, of class COperaciones.
     */
    @Test
    public void testObtenerpeliculaNeo() {
        System.out.println("obtenerpeliculaNeo");
        COperaciones instance = new COperaciones();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.obtenerpeliculaNeo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_CliNeo method, of class COperaciones.
     */
    @Test
    public void testEliminar_CliNeo() {
        System.out.println("eliminar_CliNeo");
        int id = 0;
        COperaciones instance = new COperaciones();
        instance.eliminar_CliNeo(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarCliNeo method, of class COperaciones.
     */
    @Test
    public void testModificarCliNeo() {
        System.out.println("modificarCliNeo");
        int id = 0;
        String valor = "";
        String Columna = "";
        COperaciones instance = new COperaciones();
        instance.modificarCliNeo(id, valor, Columna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeliculasNeo method, of class COperaciones.
     */
    @Test
    public void testGetPeliculasNeo() {
        System.out.println("getPeliculasNeo");
        COperaciones instance = new COperaciones();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.getPeliculasNeo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_PeliNeo method, of class COperaciones.
     */
    @Test
    public void testEliminar_PeliNeo() {
        System.out.println("eliminar_PeliNeo");
        int id = 0;
        COperaciones instance = new COperaciones();
        instance.eliminar_PeliNeo(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPeliNeo method, of class COperaciones.
     */
    @Test
    public void testModificarPeliNeo() {
        System.out.println("modificarPeliNeo");
        int id = 0;
        String valor = "";
        String Columna = "";
        COperaciones instance = new COperaciones();
        instance.modificarPeliNeo(id, valor, Columna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRentasNeo method, of class COperaciones.
     */
    @Test
    public void testGetRentasNeo() {
        System.out.println("getRentasNeo");
        COperaciones instance = new COperaciones();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.getRentasNeo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarRentasNeo method, of class COperaciones.
     */
    @Test
    public void testModificarRentasNeo() {
        System.out.println("modificarRentasNeo");
        int id = 0;
        String valor = "";
        String Columna = "";
        COperaciones instance = new COperaciones();
        instance.modificarRentasNeo(id, valor, Columna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_RentasNeo method, of class COperaciones.
     */
    @Test
    public void testEliminar_RentasNeo() {
        System.out.println("eliminar_RentasNeo");
        int id = 0;
        COperaciones instance = new COperaciones();
        instance.eliminar_RentasNeo(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of terminar_renta method, of class COperaciones.
     */
    @Test
    public void testTerminar_renta() {
        System.out.println("terminar_renta");
        String peli = "";
        int ejem = 0;
        COperaciones instance = new COperaciones();
        instance.terminar_renta(peli, ejem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectoresNeo method, of class COperaciones.
     */
    @Test
    public void testGetDirectoresNeo() {
        System.out.println("getDirectoresNeo");
        COperaciones instance = new COperaciones();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.getDirectoresNeo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_DirNeo method, of class COperaciones.
     */
    @Test
    public void testEliminar_DirNeo() {
        System.out.println("eliminar_DirNeo");
        int id = 0;
        COperaciones instance = new COperaciones();
        instance.eliminar_DirNeo(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarDirNeo method, of class COperaciones.
     */
    @Test
    public void testModificarDirNeo() {
        System.out.println("modificarDirNeo");
        int id = 0;
        String valor = "";
        String Columna = "";
        COperaciones instance = new COperaciones();
        instance.modificarDirNeo(id, valor, Columna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActoresNeo method, of class COperaciones.
     */
    @Test
    public void testGetActoresNeo() {
        System.out.println("getActoresNeo");
        COperaciones instance = new COperaciones();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.getActoresNeo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_ActNeo method, of class COperaciones.
     */
    @Test
    public void testEliminar_ActNeo() {
        System.out.println("eliminar_ActNeo");
        int id = 0;
        COperaciones instance = new COperaciones();
        instance.eliminar_ActNeo(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarActNeo method, of class COperaciones.
     */
    @Test
    public void testModificarActNeo() {
        System.out.println("modificarActNeo");
        int id = 0;
        String valor = "";
        String Columna = "";
        COperaciones instance = new COperaciones();
        instance.modificarActNeo(id, valor, Columna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEjemplaresNeo method, of class COperaciones.
     */
    @Test
    public void testGetEjemplaresNeo() {
        System.out.println("getEjemplaresNeo");
        COperaciones instance = new COperaciones();
        DefaultListModel expResult = null;
        DefaultListModel result = instance.getEjemplaresNeo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_EjemNeo method, of class COperaciones.
     */
    @Test
    public void testEliminar_EjemNeo() {
        System.out.println("eliminar_EjemNeo");
        int id = 0;
        COperaciones instance = new COperaciones();
        instance.eliminar_EjemNeo(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEjemNeo method, of class COperaciones.
     */
    @Test
    public void testModificarEjemNeo() {
        System.out.println("modificarEjemNeo");
        int id = 0;
        String valor = "";
        String Columna = "";
        COperaciones instance = new COperaciones();
        instance.modificarEjemNeo(id, valor, Columna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarSTEjemNeo method, of class COperaciones.
     */
    @Test
    public void testModificarSTEjemNeo() {
        System.out.println("modificarSTEjemNeo");
        int id = 0;
        String valor = "";
        COperaciones instance = new COperaciones();
        instance.modificarSTEjemNeo(id, valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
