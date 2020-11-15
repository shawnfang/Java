package designDemo.D0_00;

public class AbMan extends AbstractorAnimal {

    public AbMan(){
        setHeight(180);
        setWeight(100);
    }

    @Override
    public void eat() {
        System.out.println("我是一个要吃饭的人");
        System.out.println("我的身高是："+ getHeight());
        System.out.println("我的体重是："+ getWeight());
    }
}
