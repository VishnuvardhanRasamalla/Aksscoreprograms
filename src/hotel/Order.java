package hotel;

public class Order {
    private String itemName;
    // using constructor

    public Order(String itemName) {
        this.itemName = itemName;
    }
    // getter

    public String getItemName() {
        return itemName;
    }
    //  setter

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    @Override
    public String toString() {
        return "Order{" +
                "itemName='" + itemName + '\'' +
                '}';
    }
}
