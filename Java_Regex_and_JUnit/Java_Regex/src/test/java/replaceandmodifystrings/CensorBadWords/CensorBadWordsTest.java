package replaceandmodifystrings.CensorBadWords;

import org.junit.jupiter.api.Test;
// Creating class CensorBadWordsTest to test our program
public class CensorBadWordsTest
{
    @Test
    void testCensorBadWordsInSentence()
    {
        // Input text string
        String text = "This is a damn bad example with some stupid words.";
        // Calling method censorBadWords
        CensorBadWordsInSentence.censorBadWords(text);
    }
}
