package smartwarehousemanagementsystem;
// Creating Main class
public class SmartWarehouseSystem
{
    // Main Method
    public static void main(String[] args)
    {
        // Creating objects of Storage class
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Creating objects of Electronics, Groceries and Furniture class
        Electronics electronics = new Electronics("Laptop",5,50000);
        Groceries groceries = new Groceries("Soap",10,25);
        Furniture furniture = new Furniture("Table",3,500);

        // Adding items to storage
        electronicsStorage.addItem(electronics);
        groceriesStorage.addItem(groceries);
        furnitureStorage.addItem(furniture);

        // Display items details in each storage
        System.out.println("\nElectronics items Details are ");
        electronicsStorage.display(electronicsStorage.items);
        System.out.println("\nGroceries items Details are ");
        groceriesStorage.display(groceriesStorage.items);
        System.out.println("\nFurniture items Details are ");
        furnitureStorage.display(furnitureStorage.items);
    }
}
