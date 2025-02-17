package advancedjunittest.TestingTemperatureConverter;
// Creating class TemperatureConverter to converts Celsius to Fahrenheit and vice versa
public class TemperatureConverter
{
    // Method to convert temperature from Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert temperature from Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args)
    {
        double celsius = 35.0;
        double fahrenheit = 95.0;

        System.out.println(celsius + " °C is " + celsiusToFahrenheit(celsius) + " °F");
        System.out.println(fahrenheit + " °F is " + fahrenheitToCelsius(fahrenheit) + " °C");
    }
}

