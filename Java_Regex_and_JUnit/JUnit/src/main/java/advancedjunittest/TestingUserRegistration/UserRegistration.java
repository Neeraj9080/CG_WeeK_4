package advancedjunittest.TestingUserRegistration;
// Creating class UserRegistration to register User
public class UserRegistration
{
    // Method to register User
    public static void registerUser(String username, String email, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email.");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }
        System.out.println("User registered successfully : " + username);
    }

    // Main method
    public static void main(String[] args)
    {
        // Handling IllegalArgumentException
        try
        {
            registerUser("rajan", "rajan@gmail.com", "password123");
            registerUser("abhishek", "abhihekgmail.com", "password123");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}