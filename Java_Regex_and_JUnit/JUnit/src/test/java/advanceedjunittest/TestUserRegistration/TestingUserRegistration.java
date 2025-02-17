package advanceedjunittest.TestUserRegistration;
import static advancedjunittest.TestingUserRegistration.UserRegistration.registerUser;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// Creating class TestingUserRegistration to test our UserRegistration program
public class TestingUserRegistration
{
    @Test
    public void testValidRegistration() {
        assertDoesNotThrow(() -> registerUser("rajan", "rajan@example.com", "password123"));
    }

    @Test
    public void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> registerUser("", "rajan@gmail.com", "password123"));
    }

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> registerUser("rajan", "rajangmail.com", "password123"));
    }

    @Test
    public void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> registerUser("rajan", "rajan@gmail.com", "pass"));
    }
}

