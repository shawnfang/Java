package HeadFirstDesign.H1_02;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new QuackGaga();
        flyBehavior = new FlyWithWings();
    }
}
