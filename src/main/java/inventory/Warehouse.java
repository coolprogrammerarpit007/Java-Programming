package inventory;

public class Warehouse {
    private int id;
    private String warehouseName;
    private String[] inventories;

    public Warehouse(int id, String warehouseName ,String[] inventories )
    {
        this.id = id;
        this.warehouseName = warehouseName;
        this.inventories = inventories;

    }
        // get Inventories
        public String[] getInventories()
        {
            return this.inventories;
        }

}
