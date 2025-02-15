package extractionproblems.ExtractLinks;

import org.junit.jupiter.api.Test;
// Creating class ExtractLinksTest to test our program
public class ExtractLinksTest
{
    @Test
    void testExtractLinksFromWebPage()
    {
        String regex = "https?://(www\\.)?([a-zA-Z0-9.-]+)";
        // Calling method extractLinks
        ExtractLinksFromWebPage.extractLinks(regex);
    }
}
