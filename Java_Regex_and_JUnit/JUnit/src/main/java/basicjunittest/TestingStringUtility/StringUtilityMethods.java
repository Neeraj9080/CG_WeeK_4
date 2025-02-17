package basicjunittest.TestingStringUtility;
// Creating class StringUtilityMethods
public class StringUtilityMethods
{
    // Method to reverse string
    public static String reverse(String str)
    {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check string is palindrome or not
    public static boolean isPalindrome(String str)
    {
        if (str == null) {
            return false;
        }
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    // Method to convert string into UpperCase
    public static String toUpperCase(String str)
    {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
    // Main method
    public static void main(String[] args)
    {
        String str = "aabbaa";
        // Calling methods of the class
        String reversedString = reverse(str);
        boolean palindromeString = isPalindrome(str);
        String upperCaseString = toUpperCase(str);

        // Displaying results
        System.out.println("Reversed String : " + reversedString);
        System.out.println("String is Palindrome : " + palindromeString);
        System.out.println("UpperCase String : " + upperCaseString);
    }
}