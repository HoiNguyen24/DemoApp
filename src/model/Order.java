package src.model;

import java.util.ArrayList;

public class Order {
    private String code;
    private ArrayList<OrderProduct> products;

    public Order(String code, ArrayList<OrderProduct> products) {
        this.code = code;
        this.products = products;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<OrderProduct> products) {
        this.products = products;
    }
}
