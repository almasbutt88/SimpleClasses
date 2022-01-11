import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test

    public void canAdd(){
        assertEquals(7, calculator.add(5, 2));
    }
    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(5, 2));
    }
    @Test
    public void canMultiply(){
        assertEquals(10, calculator.multiply(5, 2));
    }
    @Test
    public void canDivide(){
        assertEquals(2.5, calculator.divide(5, 2), 0.0);
    }

}
