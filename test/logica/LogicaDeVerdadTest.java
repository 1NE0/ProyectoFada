/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amferu
 */
public class LogicaDeVerdadTest {
    
    public LogicaDeVerdadTest() {
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
     * Test of addA method, of class LogicaDeVerdad.
     */
    @Test
    public void testAddA() {
        System.out.println("addA");
        short numero = 0;
        LogicaDeVerdad instance = new LogicaDeVerdad();
        instance.addA(numero);
      
    }

   

    

   
   

    /**
     * Test of arregloor method, of class LogicaDeVerdad.
     */
    @Test
    public void testArregloor() {
        System.out.println("arregloor");
        boolean[] B = new boolean[21];
        B[5]=true;
        B[4]=true;
        LogicaDeVerdad instance = new LogicaDeVerdad();
        instance.addA((short)5);
        instance.addA((short)6);
        instance.addA((short)7);
        String expResult = " 4 5 6 7";
        String result = instance.arregloor(B);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of arregloy method, of class LogicaDeVerdad.
     */
    @Test
    public void testArregloy() {
        System.out.println("arregloy");
        boolean[] B = new boolean[21];
        B[5]=true;
        B[4]=true;
        LogicaDeVerdad instance = new LogicaDeVerdad();
        instance.addA((short)5);
        instance.addA((short)6);
        instance.addA((short)7);
        instance.addA((short)4);
        String expResult = " 4 5";
        String result = instance.arregloy(B);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of complemento method, of class LogicaDeVerdad.
     */
    @Test
    public void testComplemento() {
        System.out.println("complemento");
        LogicaDeVerdad instance = new LogicaDeVerdad();
        instance.addA((short)5);
        
        String expResult = " 0 1 2 3 4 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
        String result = instance.complemento();
        assertEquals(expResult, result);
        
        
    }
    
}
