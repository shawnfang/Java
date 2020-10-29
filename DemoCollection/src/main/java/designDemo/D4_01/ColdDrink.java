package designDemo.D4_01;

public class ColdDrink implements Item {
    private String name;
    private float price;
    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return this.price;
    }
}
