package basicregexproblems.ValidateHexColorCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class ValidateHexColorCodeTest to test our program
public class ValidateHexColorCodeTest
{
    @Test
    void testValidateHexColorCode()
    {
        String regex = "^#[a-fA-F0-9]{6}$";
        Assertions.assertEquals("Valid Hex Color Code",ValidateHexColorCode.validateHexColorCode(regex));
    }
}
