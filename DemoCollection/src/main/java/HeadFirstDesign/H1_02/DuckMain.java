package HeadFirstDesign.H1_02;

public class DuckMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();

        Duck rocketDuck = new ModelDuck();
        rocketDuck.setFlyBehavior(new FlyWithRocket());
        rocketDuck.performFly();
        rocketDuck.performQuack();
    }
}
