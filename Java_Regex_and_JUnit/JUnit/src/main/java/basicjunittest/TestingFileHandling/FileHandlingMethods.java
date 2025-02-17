package basicjunittest.TestingFileHandling;
import java.io.*;
// Creating class FileHandlingMethods
public class FileHandlingMethods
{
    // Method to write data into file
    public static void writeToFile(String filename, String content) throws IOException
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename)))
        {
            writer.write(content);
        }
    }

    // Method to read data from file
    public static String readFromFile(String filename) throws IOException
    {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null)
            {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    // Main method
    public static void main(String[] args)
    {
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_05_Java_Regex_and_JUnit\\JUnit\\example.txt";
        String content = "Hello, world!";

        // Handling IOException
        try
        {
            writeToFile(filePath, content);
            System.out.println("File written successfully.");

            String readContent = readFromFile(filePath);
            System.out.println("Content read from file: " + readContent);

        }
        catch (IOException e)
        {
            System.out.println("IOException caught : " + e.getMessage());
        }
    }
}
