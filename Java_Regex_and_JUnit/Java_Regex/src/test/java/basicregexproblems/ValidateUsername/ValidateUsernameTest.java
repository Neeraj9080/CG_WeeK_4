package basicregexproblems.ValidateUsername;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class ValidateUsernameTest to test our program
public class ValidateUsernameTest
{
    @Test
    void testValidateUsernameTest()
    {
        // Define the regex pattern
        String regex = "^[a-zA-Z]+_?\\d+{5,15}";
        Assertions.assertEquals("Valid UserName", ValidateUsername.validateUserName(regex));
    }
}
