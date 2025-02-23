package dynamiconlinemarketplace;
// Creating class DiscountCalculator to implement generic method
public class DiscountCalculator
{
    // Generic method discountCalculator to calculate discount
    public static <T> void discountCalculator(Product<T> product, double discount)
    {
        double discountPrice = product.getProductPrice() * (discount/100);
        product.setProductPrice(product.getProductPrice() - discountPrice);
    }
}
