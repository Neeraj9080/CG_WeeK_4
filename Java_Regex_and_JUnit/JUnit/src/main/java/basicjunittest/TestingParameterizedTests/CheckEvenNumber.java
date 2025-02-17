package basicjunittest.TestingParameterizedTests;
// Creating class CheckEvenNumber to find even number in array
public class CheckEvenNumber
{
    // Method to find even number
    public static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    // Main method
    public static void main(String[] args)
    {
        int[] numbers = {2, 4, 6, 7, 9};

        for (int number : numbers)
        {
            System.out.println("Is " + number + " even? " + isEven(number));
        }
    }
}
