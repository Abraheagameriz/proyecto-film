/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
@Suite.SuiteClasses({Vista.Listar_ExsociosIT.class, Vista.Listar_SociosIT.class, Vista.EjemplaresIT.class, Vista.Alta_PeliculasIT.class, Vista.ReportesIT.class, Vista.Alta_SociosIT.class, Vista.ActoresIT.class, Vista.RentarIT.class, Vista.Alta_RentasIT.class, Vista.DirectoresIT.class, Vista.Listar_RentasIT.class, Vista.VPrincipalIT.class, Vista.Listar_PeliculasIT.class})
public class VistaITSuite {

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
