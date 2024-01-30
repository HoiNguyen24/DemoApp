package src.model;

public class Clothes {
    private String code;
    private String name;
    private String color;
    private String type;
    private long price;
    private long quantity;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Clothes(String code, String name, String color, String type, long price, long quantity) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }
}
