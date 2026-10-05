package Assignment;

public class InvoiceItem {
    // Private instance variables
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Returns total price (unitPrice * qty)
    public double getTotal() {
        return unitPrice * qty;
    }

    // Returns formatted string representation
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}
class TestInvoiceItem {
    public static void main(String[] args) {
        // Test constructor and toString()
        InvoiceItem item1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(item1);  // toString()

        // Test Setters and Getters
        item1.setQty(999);
        item1.setUnitPrice(0.99);
        System.out.println(item1);  // toString()
        System.out.println("id is: " + item1.getId());
        System.out.println("desc is: " + item1.getDesc());
        System.out.println("qty is: " + item1.getQty());
        System.out.println("unitPrice is: " + item1.getUnitPrice());

        // Test getTotal()
        System.out.println("The total is: " + item1.getTotal());
    }
}