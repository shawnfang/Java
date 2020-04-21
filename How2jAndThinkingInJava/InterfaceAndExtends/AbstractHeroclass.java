package InterfaceAndExtends;


//Hero类可以在不提供抽象方法的前提下，声明为抽象类，一旦一个类被声明为抽象类，就不能够被直接实例化
public abstract class AbstractHeroclass {
    String name;
    int hp;
    float armor;

    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
    public abstract void attack();

    public static void main(String[] args) {
        //区别1：
        //子类只能继承一个抽象类，不能继承多个
        //子类可以实现多个接口
        //区别2：
        //抽象类可以定义
        //public,protected,package,private
        //静态和非静态属性
        //final和非final属性
        //但是接口中声明的属性，只能是
        //public
        //静态
        //final的
        //即便没有显式的声明
    }
}
