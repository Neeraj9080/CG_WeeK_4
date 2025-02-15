package replaceandmodifystrings.ReplaceMultipleSpaces;
// Creating class ReplaceMultipleSpacesWithSingleSpace to replace multiple spaces into single space
public class ReplaceMultipleSpacesWithSingleSpace
{
    // Method to replace multiple spaces
    public static void replaceMultipleSpaces(String text)
    {
        String replacedText = text.replaceAll("\\s+", " ");
        System.out.println("Original Text :- " + text);
        System.out.println("\nAfter removing multiple spaces text is :- " + replacedText);
    }
    // Main method
    public static void main(String[] args)
    {
        // Input text string
        String text = "This  is  an  example  with  multiple     spaces.";
        // Calling method extractLinks
        replaceMultipleSpaces(text);
    }
}
