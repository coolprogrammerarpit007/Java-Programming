package inventory;

public class Product {
    private int productId;
    private String productName;
    private  double price;

    public Product(int productId, String productName, double price)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductName()
    {
        return this.productName;
    }
}
