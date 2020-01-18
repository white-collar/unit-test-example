package calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator(499, 788);
    }

    @Test
    public void checkGetSum() {
        assertEquals(300, calculator.getSum());
        assertFalse(calculator.getSum() > 500);

    }

    @Test
    public void checkGetDiff() {
        assertEquals(10, calculator.getDiff());
        assertTrue(calculator.getDiff() > -600);
    }

    @After
    public void bye() {
        System.out.println("Bye!");
    }

}
