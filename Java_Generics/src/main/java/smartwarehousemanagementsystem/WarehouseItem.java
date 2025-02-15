package smartwarehousemanagementsystem;
// Creating abstract class WarehouseItem
public abstract class WarehouseItem
{
    // Attribute of the class
    private String name;
    private int quantity;
    private double price;

    // Parameterized constructor of the class
    WarehouseItem(String name, int quantity, double price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }
}
