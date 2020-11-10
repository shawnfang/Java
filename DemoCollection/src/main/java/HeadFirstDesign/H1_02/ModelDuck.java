package HeadFirstDesign.H1_02;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWings();
        quackBehavior = new Quackzhizhi();
    }
}
