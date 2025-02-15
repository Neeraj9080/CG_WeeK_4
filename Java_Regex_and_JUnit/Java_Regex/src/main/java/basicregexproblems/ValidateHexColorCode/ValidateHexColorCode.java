package basicregexproblems.ValidateHexColorCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Creating class ValidateHexColorCode to validate Hex Color Code
public class ValidateHexColorCode
{
    // Method to validate Hex Color Code
    public static String validateHexColorCode(String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        // Input string to check
        String input = "#FFA500";
        // Create matcher object
        Matcher matcher = pattern.matcher(input);
        // Find matches
        if(matcher.matches())
        {
            return "Valid Hex Color Code";
        }
        return "Invalid Hex Color Code";
    }
    // Main method
    public static void main(String[] args)
    {
        String regex = "^#[a-fA-F0-9]{6}$";
        // Calling method validateHexColorCode
        String result = validateHexColorCode(regex);
        System.out.println(result);
    }
}
