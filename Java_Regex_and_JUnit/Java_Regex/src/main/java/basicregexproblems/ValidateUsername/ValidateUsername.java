package basicregexproblems.ValidateUsername;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Creating class ValidateUsername to validate UserName
public class ValidateUsername
{
    // Method to validate UserName
    public static String validateUserName(String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        // Input string to check
        String input = "user_123";
        // Create matcher object
        Matcher matcher = pattern.matcher(input);
        // Find matches
        if(matcher.matches())
        {
            return "Valid UserName";
        }
        return "Invalid UserName";
    }
    // Main method
    public static void main(String[] args)
    {
        // Define the regex pattern
        String regex = "^[a-zA-Z]+_?\\d+{5,15}";
        // Calling method validateUserName
        String result = validateUserName(regex);
        System.out.println(result);
    }
}
