package HeadFirstDesign.H1_01;

public class MallardDuck extends Duck implements Flyable,Quackable {
    @Override
    public void fly() {
        System.out.println("我是会飞的绿头鸭");
    }

    @Override
    public void quack() {
        System.out.println("我是会嘎嘎叫的绿头鸭");
    }
}
