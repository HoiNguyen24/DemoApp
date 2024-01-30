package src.model;

import src.manager.DateManager;

public class Decal {
    private String code;
    private String name;
    private String color;
    private long price;
    private long quantity;

    private DateManager dateManager;
    public Decal(String code, String name, String color, long price, long quantity) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.dateManager = new DateManager();
    }

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
}
