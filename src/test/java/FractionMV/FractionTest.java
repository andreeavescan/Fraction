package FractionMV;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */

public class FractionTest {

    private Fraction fc1, fc2;


    @Before
    public void setUp() throws Exception {
        fc1 = new Fraction(12,30);
        fc2 = new Fraction(-25,7);
    }

    @Test
    public void testSimplify() {
        fc1.Simplify();
        assertEquals(2, fc1.getNumerator());
        assertEquals(5, fc1.getDenominator());

        fc2.Simplify();
        assertEquals(-25, fc2.getNumerator());
        assertEquals(7, fc2.getDenominator());
    }

    @Test
    public void testGetDenominator() {
        int result = fc1.getDenominator();
        assertTrue("getDenominator() returned " + result + " instead of 30.", result == 30);
        result = fc2.getDenominator();
        assertEquals(7, result);

    }
    @Test
    public void testSetDenominator() {

        fc1.setDenominator(1);
        int result = fc1.getDenominator();
        assertTrue("getDenominator() returned " + result + " instead of 1.", result == 1);
        fc2.setNumerator(6);
        result = fc2.getNumerator();
        assertEquals(6, result);

    }

}
