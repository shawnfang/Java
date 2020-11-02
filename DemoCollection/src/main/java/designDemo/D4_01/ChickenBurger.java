package designDemo.D4_01;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "我是鸡肉汉堡";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
