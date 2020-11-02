package designDemo.D4_01;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "我是素食汉堡";
    }


    @Override
    public float price() {
        return 1.0f;
    }
}
