package InterfaceAndExtends;

public  abstract  class Anonymousclass {
    String name;
    int hp;
    float armor;

    public abstract void  attack();

    public static void main(String[] args) {
        Wapon W = new Wapon();
        W.attrackSpeed = 100;
        System.out.println(W.attrackSpeed);

        // 匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
        //通常情况下，要使用一个接口或者抽象类，都必须创建一个子类
        //
        //有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
        //既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
        //这样的类，叫做匿名类

        //在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final ，在jdk8中，已经不需要强制修饰成final了
        final int damage = 5;
        AbstractHeroclass A = new AbstractHeroclass() {
            @Override
            public void attack() {
                System.out.println("新的进攻手段,能造成"+ damage +"滴血的伤害");
            }
        };
        A.attack();

        System.out.println(A);
    }
}
