
package StringReverse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author coding_java
 */
public class ReverseStringTest {
    
    public ReverseStringTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of reverseit method, of class ReverseString.
     */
    @Test
    public void testReverseit() {
        System.out.println("The reversed string");
        String s = "hello";
        ReverseString instance = new ReverseString();
        String expResult = "olleh";
        String result = instance.reverseit(s);
        assertEquals(expResult, result);

    }
    
}
