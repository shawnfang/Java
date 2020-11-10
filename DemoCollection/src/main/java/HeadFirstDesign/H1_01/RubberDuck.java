package HeadFirstDesign.H1_01;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("我是只会唧唧叫的橡皮鸭");
    }
}
