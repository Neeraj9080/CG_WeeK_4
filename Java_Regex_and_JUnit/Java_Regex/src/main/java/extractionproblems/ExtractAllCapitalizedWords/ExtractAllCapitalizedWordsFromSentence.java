package extractionproblems.ExtractAllCapitalizedWords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Creating class ExtractAllCapitalizedWordsFromSentence to extract capitalized words from sentence
public class ExtractAllCapitalizedWordsFromSentence
{
    // Method to extract capitalized words
    public static void extractCapitalizedWords(String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        // Input text string to extract capitalized words
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        // Create matcher object
        Matcher matcher = pattern.matcher(text);
        // Find matches
        while(matcher.find())
        {
            System.out.print(matcher.group() + ", ");
        }
    }
    // Main method
    public static void main(String[] args)
    {
        String regex = "\\b[A-Z][A-Za-z0-9]*\\b";
        // Calling method extractCapitalizedWords
        extractCapitalizedWords(regex);
    }
}
