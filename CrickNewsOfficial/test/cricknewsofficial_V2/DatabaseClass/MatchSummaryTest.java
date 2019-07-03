/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricknewsofficial_V2.DatabaseClass;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihindu Ranasinghe
 */
public class MatchSummaryTest {
    
    public MatchSummaryTest() {
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
     * Test of getInnings1 method, of class MatchSummary.
     */
    @Test
    public void testGetInnings1() {
        System.out.println("getInnings1");
        MatchSummary instance = new MatchSummary();
        ResultSet expResult = null;
        ResultSet result = instance.getInnings1();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setInnings1 method, of class MatchSummary.
     */
    @Test
    public void testSetInnings1() {
        System.out.println("setInnings1");
        ResultSet Innings1 = null;
        MatchSummary instance = new MatchSummary();
        instance.setInnings1(Innings1);
       
    }

    /**
     * Test of getInnings2 method, of class MatchSummary.
     */
    @Test
    public void testGetInnings2() {
        System.out.println("getInnings2");
        MatchSummary instance = new MatchSummary();
        ResultSet expResult = null;
        ResultSet result = instance.getInnings2();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setInnings2 method, of class MatchSummary.
     */
    @Test
    public void testSetInnings2() {
        System.out.println("setInnings2");
        ResultSet Innings2 = null;
        MatchSummary instance = new MatchSummary();
        instance.setInnings2(Innings2);
      
    }

    /**
     * Test of getWinner method, of class MatchSummary.
     */
    @Test
    public void testGetWinner() {
        System.out.println("getWinner");
        MatchSummary instance = new MatchSummary();
        ResultSet expResult = null;
        ResultSet result = instance.getWinner();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setWinner method, of class MatchSummary.
     */
    @Test
    public void testSetWinner() {
        System.out.println("setWinner");
        ResultSet Winner = null;
        MatchSummary instance = new MatchSummary();
        instance.setWinner(Winner);
        
    }
    
}
