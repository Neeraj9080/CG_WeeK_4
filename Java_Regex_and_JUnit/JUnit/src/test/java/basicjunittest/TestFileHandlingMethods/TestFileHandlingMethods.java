package basicjunittest.TestFileHandlingMethods;

import static basicjunittest.TestingFileHandling.FileHandlingMethods.readFromFile;
import static basicjunittest.TestingFileHandling.FileHandlingMethods.writeToFile;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.File;
import java.io.IOException;

import java.nio.file.Path;
// Creating class TestingFileHandlingMethods to test our FileHandlingMethods program
public class TestFileHandlingMethods
{
    @TempDir
    Path tempDir;

    @Test
    public void testWriteAndReadFile() throws IOException
    {
        File tempFile = tempDir.resolve("testfile.txt").toFile();
        String content = "Test content";

        writeToFile(tempFile.getAbsolutePath(), content);
        assertTrue(tempFile.exists());

        String readContent = readFromFile(tempFile.getAbsolutePath());
        assertEquals(content, readContent);
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        File tempFile = tempDir.resolve("testfile_exists.txt").toFile();
        String content = "Another test content";
        writeToFile(tempFile.getAbsolutePath(), content);
        assertTrue(tempFile.exists());
    }

    @Test
    public void testIOExceptionWhenFileDoesNotExist()
    {
        String nonExistentFile = "nonexistentfile.txt";
        assertThrows(IOException.class, () -> readFromFile(nonExistentFile));
    }
}
