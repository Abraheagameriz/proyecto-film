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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author sonic
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Modelo.CSociosIT.class, Modelo.CEjemplaresIT.class, Modelo.CActoresIT.class, Modelo.CRentasIT.class, Modelo.CPeliculasIT.class, Modelo.CDirectoresIT.class})
public class ModeloITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
