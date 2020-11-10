package HeadFirstDesign.H1_01;

public class RedheadDuck extends Duck implements Flyable,Quackable {
    @Override
    public void fly() {
        System.out.println("我是会飞的红头鸭");
    }

    @Override
    public void quack() {
        System.out.println("我是吱吱叫的红头鸭");
    }
}
