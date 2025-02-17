package advanceedjunittest.TestDateFormatter;
import static advancedjunittest.TestingDateFormatter.DateFormatter.formatDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
// Creating class TestingDateFormatter to test our DateFormatter program
public class TestingDateFormatter
{
    @Test
    public void testValidDate() throws ParseException {
        assertEquals("15-02-2025", formatDate("2025-02-15"));
    }

    @Test
    public void testInvalidDate() {
        assertThrows(ParseException.class, () -> formatDate("invalid-date"));
    }
}