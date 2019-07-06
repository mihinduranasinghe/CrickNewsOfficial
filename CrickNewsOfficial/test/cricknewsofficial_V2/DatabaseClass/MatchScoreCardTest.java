
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
public class MatchScoreCardTest {
    
    public MatchScoreCardTest() {
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
     * Test of setMatchScoreCard method, of class MatchScoreCard.
     */
 

    /**
     * Test of getScorecard2 method, of class MatchScoreCard.
     */
    @Test
    public void testGetScorecard2() {
        System.out.println("getScorecard2");
        MatchScoreCard instance = new MatchScoreCard();
        ResultSet expResult = null;
        ResultSet result = instance.getScorecard2();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setScorecard2 method, of class MatchScoreCard.
     */
    @Test
    public void testSetScorecard2() {
        System.out.println("setScorecard2");
        ResultSet scorecard2 = null;
        MatchScoreCard instance = new MatchScoreCard();
        instance.setScorecard2(scorecard2);
       
    }

    /**
     * Test of getScorecard method, of class MatchScoreCard.
     */
    @Test
    public void testGetScorecard() {
        System.out.println("getScorecard");
        MatchScoreCard instance = new MatchScoreCard();
        ResultSet expResult = null;
        ResultSet result = instance.getScorecard();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setScorecard method, of class MatchScoreCard.
     */
    @Test
    public void testSetScorecard() {
        System.out.println("setScorecard");
        ResultSet scorecard = null;
        MatchScoreCard instance = new MatchScoreCard();
        instance.setScorecard(scorecard);
      
    }
    
}
