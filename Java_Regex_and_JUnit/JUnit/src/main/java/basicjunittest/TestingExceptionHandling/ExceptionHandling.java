package basicjunittest.TestingExceptionHandling;
// Creating class ExceptionHandling
public class ExceptionHandling
{
    // Method to perform division operation
    public static int divide(int a, int b) {
        if (b == 0)
        {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Main method
    public static void main(String[] args)
    {
        // Handling ArithmeticException
        try
        {
            System.out.println("Result: " + divide(4, 2));
            System.out.println("Result: " + divide(4, 0));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

