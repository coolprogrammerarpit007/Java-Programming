package inventory;

public class Inventory {

    private int inventoryId;
    private String[] products;
    private int quantity;

    public Inventory(int inventoryId,String[] products, int quantity )
    {
        this.inventoryId = inventoryId;
        this.products = products;
        this.quantity = quantity;
    }

    public String[] getProducts()
    {
        return this.products;
    }
}
