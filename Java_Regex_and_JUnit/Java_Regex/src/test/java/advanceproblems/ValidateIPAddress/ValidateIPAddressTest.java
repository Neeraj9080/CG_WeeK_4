package advanceproblems.ValidateIPAddress;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// Creating class ValidateIPAddressTest to test our program
public class ValidateIPAddressTest
{
    @Test
    void testValidateIPAddress()
    {
        // Define the regex pattern
        String regex = "^([0-9]{1,3}\\.){3}[0-9]{1,3}$";
        Assertions.assertEquals("Valid IP Address",ValidateIPAddress.validateIPAddress(regex));
    }
}
