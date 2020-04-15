package interfaceAndExtends;

public class ExtendsAbstractHeroclass extends AbstractHeroclass {
    int age;

    // 继承抽象类后，具体实现抽象方法
    @Override
    public void attack() {
        System.out.println("这是一个攻击方法");
    }
}
