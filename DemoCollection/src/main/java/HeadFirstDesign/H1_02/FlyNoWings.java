package HeadFirstDesign.H1_02;

public class FlyNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("没有翅膀不能飞行的鸭子");
    }
}
