package advanceproblems.ExtractCurrencyValues;

import org.junit.jupiter.api.Test;
// Creating class ExtractCurrencyValuesTest to test our program
public class ExtractCurrencyValuesTest
{
    @Test
    void testExtractCurrencyValues()
    {
        String regex = "\\$?\\d+\\.\\d{2}";
        ExtractCurrencyValuesFromText.extractCurrencyValues(regex);
    }
}
