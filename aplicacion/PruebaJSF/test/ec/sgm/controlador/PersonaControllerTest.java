/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.sgm.controlador;

import ec.sgm.modelo.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JONNATHAN
 */
public class PersonaControllerTest {
    
    public PersonaControllerTest() {
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
     * Test of cargarPersona method, of class PersonaController.
     */
    @Test
    public void testCargarPersona() {
        System.out.println("cargarPersona");
        PersonaController instance = new PersonaController();
        instance.cargarPersona();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersona method, of class PersonaController.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        PersonaController instance = new PersonaController();
        Persona expResult = null;
        Persona result = instance.getPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersona method, of class PersonaController.
     */
    @Test
    public void testSetPersona() {
        System.out.println("setPersona");
        Persona persona = null;
        PersonaController instance = new PersonaController();
        instance.setPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
