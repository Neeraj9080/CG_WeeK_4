package basicjunittest.TestListOperations;
import static basicjunittest.TestingListOperations.ListOperations.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
// Creating class TestingListOperations to test our ListOperations program
public class TestingListOperations
{
    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        removeElement(list, 5);
        assertFalse(list.contains(5));
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        addElement(list, 5);
        assertEquals(1, getSize(list));
    }
}


