package advancedjunittest.TestingDateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
// Creating class DateFormatter to format date
public class DateFormatter
{
    // Method to format date
    public static String formatDate(String inputDate) throws ParseException
    {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = inputFormat.parse(inputDate);
        return outputFormat.format(date);
    }

    // Main Method
    public static void main(String[] args)
    {
        String inputDate = "2025-02-15";
        // Handling ParseException
        try
        {
            String outputDate = formatDate(inputDate);
            System.out.println("Formatted Date : " + outputDate);
        }
        catch (ParseException e)
        {
            System.out.println("Invalid date format : " + e.getMessage());
        }
    }
}