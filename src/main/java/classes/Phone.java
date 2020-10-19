package classes;

public class Phone implements product {
     private int id;
     private int price;
     private String phone_name;
     private int quantity;
     private int version;

    @Override
    public void getTotalPrice() {

    }

    public Phone(int id, int price, String phone_name, int quantity, int version) {
        this.id = id;
        this.price = price;
        this.phone_name = phone_name;
        this.quantity = quantity;
        this.version = version;
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

    public String getPhone_name() {
        return phone_name;
    }

    public void setPhone_name(String phone_name) {
        this.phone_name = phone_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
