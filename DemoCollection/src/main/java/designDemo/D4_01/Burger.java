package designDemo.D4_01;

public class Burger implements Item {
    private String name;
    private float price;
    private Packing packing;
    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return this.price;
    }
}
