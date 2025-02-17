package advanceedjunittest.TestPasswordStrengthValidator;
import static advancedjunittest.TestingPasswordStrengthValidator.PasswordValidator.validatePassword;
import org.junit.jupiter.api.Test;
// Creating class TestingPasswordStrengthValidator to test our PasswordValidator program
public class TestingPasswordStrengthValidator
{
    @Test
    public void testValidPasswords()
    {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        String[] passwords = {"Password1", "ValidPass1"};
        validatePassword(regex,passwords);
    }

    @Test
    public void testInvalidPasswords()
    {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        String[] passwords = {"password", "PASSWORD"};
        validatePassword(regex,passwords);
    }
}

