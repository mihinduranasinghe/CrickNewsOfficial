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
public class CricketTeamsTest {
    
    public CricketTeamsTest() {
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
     * Test of getCriketteams method, of class CricketTeams.
     */
    @Test
    public void testGetCriketteams() {
        System.out.println("getCriketteams");
        CricketTeams instance = new CricketTeams();
        ResultSet expResult = null;
        ResultSet result = instance.getCriketteams();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCriketteams method, of class CricketTeams.
     */
    @Test
    public void testSetCriketteams() {
        System.out.println("setCriketteams");
        ResultSet criketteams = null;
        CricketTeams instance = new CricketTeams();
        instance.setCriketteams(criketteams);
       
    }
    
}
