//Create a Product class with a static field productCount to track the number of objects created. Use a static
//method to display the total count.

public class Product {
    String productName;
    double productPrice;
    static int productCount = 0;
    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        productCount++;
    }
    public static void displayProductCount() {
        System.out.println("Total products created: " + productCount);
    }
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 120000.00);
        Product product2 = new Product("iphone", 80000.00);
        Product product3 = new Product("Headphones", 1500.00);
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();
        Product.displayProductCount();
    }
}