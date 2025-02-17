package basicjunittest.TestPerformanceTestingUsingTimeout;
import static basicjunittest.PerformanceTestingUsingTimeout.TaskManager.longRunningTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
// Creating class PerformanceTestingUsingTimeoutAnnotation to use @Timeout Annotation
public class PerformanceTestingUsingTimeoutAnnotation
{
    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() throws InterruptedException
    {
        longRunningTask();
    }
}


