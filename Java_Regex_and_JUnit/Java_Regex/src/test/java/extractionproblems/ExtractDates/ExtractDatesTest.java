package extractionproblems.ExtractDates;

import org.junit.jupiter.api.Test;
// Creating class ExtractDatesTest to test our program
public class ExtractDatesTest
{
    @Test
    void testExtractDates()
    {
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        // Calling method extractEmailAddresses
        ExtractDatesFromText.extractDates(regex);
    }
}
