package dynamiconlinemarketplace;
// Creating genric class Product
public class Product<T>
{
    // Attribute of the class
    final private String productName;
    private double productPrice;
    final private T productCategory;

    // Parameterized constructor of the class
    public Product (String productName, double productPrice, T productCategory)
    {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    // Creating getter methods
    public String getProductName()
    {
        return productName;
    }

    public  double getProductPrice()
    {
        return productPrice;
    }

    public T getProductCategory()
    {
        return productCategory;
    }

    public void setProductPrice(double productPrice)
    {
        this.productPrice = productPrice;
    }
}
