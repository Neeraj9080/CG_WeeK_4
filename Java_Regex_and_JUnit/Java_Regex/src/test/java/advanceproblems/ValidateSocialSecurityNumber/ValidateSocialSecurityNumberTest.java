package advanceproblems.ValidateSocialSecurityNumber;

import org.junit.jupiter.api.Test;
// Creating class ValidateSocialSecurityNumberTest to test our program
public class ValidateSocialSecurityNumberTest
{
    @Test
    void testValidateSocialSecurityNumber()
    {
        String regex = "\\d{3}-\\d{2}-\\d{4}";
        // Calling method validateSSN
        ValidateSocialSecurityNumber.validateSSN(regex);
    }
}
