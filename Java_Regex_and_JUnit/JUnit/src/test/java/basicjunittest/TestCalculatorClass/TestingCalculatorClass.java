package basicjunittest.TestCalculatorClass;
import static org.junit.jupiter.api.Assertions.*;
import basicjunittest.TestingCalculatorClass.CalculatorClass;
import org.junit.jupiter.api.Test;
// Creating class TestingCalculatorClass to test our CalculatorClass program
public class TestingCalculatorClass
{
    CalculatorClass calculator = new CalculatorClass();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(5, calculator.subtract(2, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2));
        assertEquals(-2.0, calculator.divide(4, -2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(4, 0));
    }
}

