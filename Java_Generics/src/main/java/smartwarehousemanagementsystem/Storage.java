package smartwarehousemanagementsystem;
import java.util.ArrayList;
import java.util.List;
// Generic class Storage
public class Storage<T extends WarehouseItem>
{
    List<T> items = new ArrayList<T>();
    // Adding items to the storage
    public void addItem(T item)
    {
        items.add(item);
    }

    // Wildcard method to display all items
    public void display(List<? extends WarehouseItem> items)
    {
        for(WarehouseItem item : items)
        {
            System.out.println("Item name is " + item.getName());
            System.out.println("Item quantity is " + item.getQuantity());
            System.out.println("Item price is " + item.getPrice());
        }
    }
}
