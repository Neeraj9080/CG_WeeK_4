package basicjunittest.TestingCalculatorClass;
// Creating class CalculatorClass
public class CalculatorClass
{
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
    // Main method
    public static void main(String[] args)
    {
        // Creating object of CalculatorClass
        CalculatorClass calculate = new CalculatorClass();
        // Callings methods of CalculatorClass
        int add = calculate.add(4,2);
        int subtract = calculate.subtract(4,2);
        int multiple = calculate.multiply(4,2);
        double divide = calculate.divide(4, 2);
        //Displaying results
        System.out.println("Addition : " + add);
        System.out.println("Subtraction : " + subtract);
        System.out.println("Multiplication : " + multiple);
        System.out.println("Division : " + divide);
    }
}

