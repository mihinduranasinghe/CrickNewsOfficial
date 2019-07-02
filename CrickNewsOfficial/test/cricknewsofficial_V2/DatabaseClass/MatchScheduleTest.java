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
public class MatchScheduleTest {
    
    public MatchScheduleTest() {
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
     * Test of getMatchSchedule method, of class MatchSchedule.
     */
    @Test
    public void testGetMatchSchedule() {
        System.out.println("getMatchSchedule");
        MatchSchedule instance = new MatchSchedule();
        ResultSet expResult = null;
        ResultSet result = instance.getMatchSchedule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatchSchedule method, of class MatchSchedule.
     */
    @Test
    public void testSetMatchSchedule() {
        System.out.println("setMatchSchedule");
        ResultSet MatchSchedule = null;
        MatchSchedule instance = new MatchSchedule();
        instance.setMatchSchedule(MatchSchedule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
