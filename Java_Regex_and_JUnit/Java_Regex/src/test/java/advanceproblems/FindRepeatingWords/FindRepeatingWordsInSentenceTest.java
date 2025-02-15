package advanceproblems.FindRepeatingWords;

import org.junit.jupiter.api.Test;
// Creating class FindRepeatingWordsInSentenceTest to test our program
public class FindRepeatingWordsInSentenceTest
{
    @Test
    void testFindRepeatingWords()
    {
        String regex = "\\b(\\w+)\\s+\\1\\b";
        // Calling method findRepeatingWords
        FIndRepeatingWordsInSentence.findRepeatingWords(regex);
    }
}
