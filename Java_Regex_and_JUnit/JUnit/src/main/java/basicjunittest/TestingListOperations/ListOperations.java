package basicjunittest.TestingListOperations;
import java.util.ArrayList;
import java.util.List;
// Creating class ListOperations
public class ListOperations
{
    // Method to add element in list
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Method to remove element from list
    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    // Method to get list size
    public static int getSize(List<Integer> list) {
        return list.size();
    }

    // Main Method
    public static void main(String[] args)
    {
        List<Integer> integerList= new ArrayList<>();
        // Calling methods of the class
        addElement(integerList,4);
        addElement(integerList,8);
        addElement(integerList,12);
        removeElement(integerList,8);
        int listSize = getSize(integerList);
        // Displaying results
        System.out.println("List Size : " + listSize);
    }
}

