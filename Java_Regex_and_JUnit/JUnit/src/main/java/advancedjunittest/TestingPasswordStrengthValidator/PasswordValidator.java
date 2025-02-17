package advancedjunittest.TestingPasswordStrengthValidator;
import java.util.regex.*;
// Creating class PasswordValidator to validate Password
public class PasswordValidator
{
    // Method to validate Password
    public static void validatePassword(String regex, String[] passwords)
    {
        Pattern pattern = Pattern.compile(regex);
        for (String password : passwords)
        {
            Matcher matcher = pattern.matcher(password);
            System.out.println(password + " is valid : " + matcher.matches());
        }
    }
    public static void main(String[] args)
    {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        String[] passwords = {"Password1", "password", "PASSWORD", "PassWord5544", "ValidPass1"};
        // Calling methods of the class
        validatePassword(regex,passwords);
    }
}
