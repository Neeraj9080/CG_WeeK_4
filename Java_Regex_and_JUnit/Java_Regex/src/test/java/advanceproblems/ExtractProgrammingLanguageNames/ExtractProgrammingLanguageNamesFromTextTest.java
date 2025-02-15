package advanceproblems.ExtractProgrammingLanguageNames;

import org.junit.jupiter.api.Test;
// Creating class ExtractProgrammingLanguageNamesFromTextTest to test our program
public class ExtractProgrammingLanguageNamesFromTextTest
{
    @Test
    void testExtractProgrammingLanguageNamesFromText()
    {
        String regex = "\\b(C\\+\\+|Java|Python|JavaScript|Go|C#|Ruby|Swift|Kotlin|PHP|HTML|CSS)\\b";
        ExtractProgrammingLanguageNamesFromText.extractLanguages(regex);
    }
}
