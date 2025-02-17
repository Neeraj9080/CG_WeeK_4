package basicjunittest.PerformanceTestingUsingTimeout;
// Creating class TaskManager
public class TaskManager
{
    // Method to set task running task
    public static String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // Sleep for 3 seconds
        return "Task Completed";
    }

    // Main method
    public static void main(String[] args)
    {
        // Handling Exception
        try
        {
            System.out.println("Result: " + longRunningTask());
        }
        catch (InterruptedException e)
        {
            System.out.println("Task was interrupted.");
        }
    }
}
