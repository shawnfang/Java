package HeadFirstDesign.H1_01;

public class DuckMain {
    /**
     * 这种方案可以解决不该有某些特征的子类不会强行继承某些特征
     * 但是，会出现一个代码复用的问题，具有相同特征的不同子类
     * 需要重复实现相同的特征，例如飞行的特征，在A,B两个子类
     * 中需要重复实现
     * @param args
     */
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.display();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.fly();
        redheadDuck.quack();
        redheadDuck.display();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.quack();
        rubberDuck.display();

    }
}
