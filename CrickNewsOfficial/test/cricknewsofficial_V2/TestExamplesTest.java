
package cricknewsofficial_V2;

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
public class TestExamplesTest {
    
    public TestExamplesTest() {
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
     * Test of AddNumbers method, of class TestExamples.
     */
    @Test
    public void testAddNumbers() {
        
        int a=5;
        int b=3;
       TestExamples testAdd=new TestExamples();
       int result=testAdd.AddNumbers(a, b);
        assertEquals(8, result);
       
    }
    
    @Test
    public void testaddString(){
        String a="mihindu";
        String b="ranasinghe";
        TestExamples test2=new TestExamples();
        String result=test2.addText(a, b);
        assertEquals("mihinduranasinghe", result);
            
        
    }
}
