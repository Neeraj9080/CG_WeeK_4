package extractionproblems.ExtractAllCapitalizedWords;

import org.junit.jupiter.api.Test;
// Creating class ExtractAllCapitalizedWordsFromSentenceTest to test our program
public class ExtractAllCapitalizedWordsFromSentenceTest
{
    @Test
    void testExtractAllCapitalizedWordsFromSentence()
    {
        String regex = "\\b[A-Z][A-Za-z0-9]*\\b";
        // Calling method extractCapitalizedWords
        ExtractAllCapitalizedWordsFromSentence.extractCapitalizedWords(regex);
    }
}
