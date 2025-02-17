package advanceedjunittest.TestTemperatureConverter;
import static advancedjunittest.TestingTemperatureConverter.TemperatureConverter.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// Creating class TestingTemperatureConverter to test our TemperatureConverter program
public class TestingTemperatureConverter
{
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0,celsiusToFahrenheit(0), 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0,fahrenheitToCelsius(32), 0.001);
    }
}

