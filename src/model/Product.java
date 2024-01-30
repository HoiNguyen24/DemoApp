package src.model;

public class Product {
    private Clothes clothes;
    private Decal decal;

    public Product(Clothes clothes, Decal decal) {
        this.clothes = clothes;
        this.decal = decal;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public Decal getDecal() {
        return decal;
    }

    public void setDecal(Decal decal) {
        this.decal = decal;
    }
}
