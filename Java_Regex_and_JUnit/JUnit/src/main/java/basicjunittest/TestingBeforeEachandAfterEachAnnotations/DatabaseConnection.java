package basicjunittest.TestingBeforeEachandAfterEachAnnotations;
// Creating class DatabaseConnection
public class DatabaseConnection
{
    private static boolean connected;

    //Method to connect database
    public static void connect()
    {
        connected = true;
        System.out.println("Database connected.");
    }

    //Method to disconnect database
    public static void disconnect()
    {
        connected = false;
        System.out.println("Database disconnected.");
    }

    // Method to check database is connected or not
    public static boolean isConnected()
    {
        return connected;
    }

    // Main method
    public static void main(String[] args)
    {
        // Calling methods of the class
        connect();
        System.out.println("Is connected: " + isConnected());
        disconnect();
        System.out.println("Is connected: " + isConnected());
    }
}
