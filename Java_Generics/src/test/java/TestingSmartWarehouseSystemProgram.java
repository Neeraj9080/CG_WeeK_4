import org.junit.jupiter.api.Test;
import smartwarehousemanagementsystem.Electronics;
import smartwarehousemanagementsystem.Furniture;
import smartwarehousemanagementsystem.Groceries;
import smartwarehousemanagementsystem.Storage;

// Testing Smart Warehouse System Program
public class TestingSmartWarehouseSystemProgram
{
    @Test
    void testSmartWarehouseSystemProgram()
    {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop",5,50000));
        groceriesStorage.addItem(new Groceries("Soap",10,25));
        furnitureStorage.addItem(new Furniture("Table",3,500));
    }
}
