package classes;

public class Laptop implements product{
    private int id;
    private int price;
    private String laptop_name;
    private int quantity;

    @Override
    public void getTotalPrice() {

    }

    public Laptop(int id, int price, String laptop_name, int quantity) {
        this.id = id;
        this.price = price;
        this.laptop_name = laptop_name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLaptop_name() {
        return laptop_name;
    }

    public void setLaptop_name(String laptop_name) {
        this.laptop_name = laptop_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
