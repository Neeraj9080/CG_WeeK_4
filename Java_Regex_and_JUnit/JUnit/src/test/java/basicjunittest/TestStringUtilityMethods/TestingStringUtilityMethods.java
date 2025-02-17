package basicjunittest.TestStringUtilityMethods;
import static basicjunittest.TestingStringUtility.StringUtilityMethods.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// Creating class TestingStringUtilityMethods to test our StringUtilityMethods program
public class TestingStringUtilityMethods
{
    @Test
    public void testReverse() {
        assertEquals("cba",reverse("abc"));
        assertEquals(null,reverse(null));
    }

    @Test
    public void testIsPalindrome()
    {
        assertTrue(isPalindrome("aba"));
        assertFalse(isPalindrome(null));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO",toUpperCase("hello"));
        assertEquals(null,toUpperCase(null));
    }
}

