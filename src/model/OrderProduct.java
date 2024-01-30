package src.model;

public class OrderProduct extends Product{
    private long quantity;

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public OrderProduct(Clothes clothes, Decal decal, long quantity) {
        super(clothes, decal);
        this.quantity = quantity;
    }
}
