package basicjunittest.TestBeforeEachandAfterEachAnnotations;
import static basicjunittest.TestingBeforeEachandAfterEachAnnotations.DatabaseConnection.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
// Creating class TestingBeforeEachAndAfterEachAnnotations to test @BeforeEach And @AfterEach Annotations
public class TestingBeforeEachAndAfterEachAnnotations
{
    @BeforeEach
    public void setUp()
    {
        connect();
    }

    @AfterEach
    public void tearDown()
    {
        disconnect();
    }

    @Test
    public void testConnectionIsConnected()
    {
        assertTrue(isConnected());
    }

    @Test
    public void testConnectionIsDisconnected()
    {
        disconnect();
        assertFalse(isConnected());
    }
}

