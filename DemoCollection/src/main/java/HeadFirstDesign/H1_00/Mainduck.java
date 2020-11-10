package HeadFirstDesign.H1_00;

public class Mainduck {
    public static void main(String[] args) {
        /*
        问题1：不适合飞行的子类也具备了飞行的行为
        子类可以进行父类覆盖，但是每次新增一个子类，都需要进行检查是否
        覆盖了不具备的行为
         */
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.display();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.fly();
    }
}
