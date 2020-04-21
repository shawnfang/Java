package ClassAndObject;

public class Qualifierclass {
    // 仅自己可访问，其他类既不能访问也不能继承
    private float hp;
    // 没有修饰符代表package 同包类能继承也能访问，不同包类既不能访问也不能继承
    int age;
    // 可以被继承，同包类可访问，不同包类不能访问
    protected  int moveSpeed;
    // 公开，既可访问也可继承
    public String name;

    /*
    1. 属性通常使用private封装起来
    2. 方法一般使用public用于被调用
    3. 会被子类继承的方法，通常使用protected
    4. package用的不多，一般新手会用package,因为还不知道有修饰符这个东西
    作用范围最小原则
    简单说，能用private就用private，不行就放大一级，用package,再不行就用protected，最后用public。 这样就能把数据尽量的封装起来，没有必要露出来的，就不用露出来了
    */
}

