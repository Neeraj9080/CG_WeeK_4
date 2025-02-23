package dynamiconlinemarketplace;
// Creating main class DynamicOnlineMarketPlace
public class DynamicOnlineMarketPlace
{
    // Main method
    public static void main(String[] args)
    {
        // Creating Objects of BooksCategory, ClothingCategory and GadgetsCategory class
        BooksCategory category1 = new BooksCategory("Programming");
        ClothingCategory category2 = new ClothingCategory("Formal");
        GadgetsCategory category3 = new GadgetsCategory("Electronics");

        // Creating Objects of Product class
        Product <BooksCategory> booksCategoryProduct = new Product<>("Java Programming", 500,category1);
        Product <ClothingCategory> clothingCategoryProduct = new Product<>("Shirt", 450,category2);
        Product <GadgetsCategory> gadgetsCategoryProduct = new Product<>("Laptop",50000,category3);

        // Appling discount to each product
        DiscountCalculator.discountCalculator(booksCategoryProduct, 5);
        DiscountCalculator.discountCalculator(clothingCategoryProduct, 10);
        DiscountCalculator.discountCalculator(gadgetsCategoryProduct, 15);

        // Displaying new prices
        System.out.println(booksCategoryProduct.getProductName() + " new price is " + booksCategoryProduct.getProductPrice());
        System.out.println(clothingCategoryProduct.getProductName() + " new price is " + clothingCategoryProduct.getProductPrice());
        System.out.println(gadgetsCategoryProduct.getProductName() + " new price is " + gadgetsCategoryProduct.getProductPrice());
    }
}
