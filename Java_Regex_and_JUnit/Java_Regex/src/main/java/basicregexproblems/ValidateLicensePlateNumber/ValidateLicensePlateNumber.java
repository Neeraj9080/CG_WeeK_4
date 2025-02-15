package basicregexproblems.ValidateLicensePlateNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Creating class ValidateLicensePlateNumber to validate License Plate Number
public class ValidateLicensePlateNumber
{
    // Method to validate License Plate Number
    public static String validateLicensePlateNumber(String regex)
    {
            Pattern pattern = Pattern.compile(regex);
            // Input string to check
            String input = "AB1234";
            // Create matcher object
            Matcher matcher = pattern.matcher(input);
            // Find matches
            if(matcher.matches())
            {
                return "Valid License Plate Number";
            }
            return "Invalid License Plate Number";
    }
    // Main method
    public static void main(String[] args)
    {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        // Calling method validateLicensePlateNumber
        String result = validateLicensePlateNumber(regex);
        System.out.println(result);
    }
}
