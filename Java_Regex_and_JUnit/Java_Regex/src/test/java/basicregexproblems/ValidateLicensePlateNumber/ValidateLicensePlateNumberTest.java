package basicregexproblems.ValidateLicensePlateNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class ValidateLicensePlateNumberTest to test our program
public class ValidateLicensePlateNumberTest
{
    @Test
    void testValidateLicensePlateNumber()
    {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        Assertions.assertEquals("Valid License Plate Number",ValidateLicensePlateNumber.validateLicensePlateNumber(regex));
    }
}
