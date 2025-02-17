package basicjunittest.TestExceptionHandling;
import static basicjunittest.TestingExceptionHandling.ExceptionHandling.divide;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// Creating class TestingExceptionHandling to test our ExceptionHandling program
public class TestingExceptionHandling
{
    @Test
    public void testDivide()
    {
        assertEquals(2, divide(4, 2));
        assertEquals(0, divide(0, 1));
    }

    @Test
    public void testDivideByZero()
    {
        assertThrows(ArithmeticException.class, () -> divide(4, 0));
    }
}


