package basicjunittest.TestParameterizedTests;
import static basicjunittest.TestingParameterizedTests.CheckEvenNumber.isEven;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
// Creating class TestingParameterizedTests to use @ParameterizedTests
public class TestingParameterizedTests
{
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int number)
    {
        if (number % 2 == 0)
        {
            assertTrue(isEven(number));
        }
        else
        {
            assertFalse(isEven(number));
        }
    }
}




