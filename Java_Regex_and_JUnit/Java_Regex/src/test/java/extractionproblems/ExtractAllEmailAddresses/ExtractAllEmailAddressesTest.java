package extractionproblems.ExtractAllEmailAddresses;

import org.junit.jupiter.api.Test;
// Creating class ExtractAllEmailAddressesTest to test our program
public class ExtractAllEmailAddressesTest
{
    @Test
    void testExtractAllEmailAddresses()
    {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        // Calling method extractEmailAddresses
        ExtractAllEmailAddressesFromText.extractEmailAddresses(regex);
    }

}
