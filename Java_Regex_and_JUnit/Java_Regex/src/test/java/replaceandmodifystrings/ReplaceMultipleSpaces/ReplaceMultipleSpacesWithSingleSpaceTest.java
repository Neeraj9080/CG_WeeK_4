package replaceandmodifystrings.ReplaceMultipleSpaces;

import org.junit.jupiter.api.Test;
// Creating class ReplaceMultipleSpacesWithSingleSpaceTest to test our program
public class ReplaceMultipleSpacesWithSingleSpaceTest
{
    @Test
    void testReplaceMultipleSpacesWithSingleSpace()
    {
        // Input text string
        String text = "This  is  an  example  with  multiple     spaces.";
        // Calling method extractLinks
        ReplaceMultipleSpacesWithSingleSpace.replaceMultipleSpaces(text);
    }
}
