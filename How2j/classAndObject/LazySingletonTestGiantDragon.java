package classAndObject;

public class LazySingletonTestGiantDragon {

    public static void main(String[] args){
        //通过new实例化会报错
        //GiantDragon g = new LazySingletonGiantDragon();

        //只能通过getInstance得到对象
        LazySingletonGiantDragon g1 = LazySingletonGiantDragon.getInstance();
        LazySingletonGiantDragon g2 = LazySingletonGiantDragon.getInstance();
        LazySingletonGiantDragon g3 = LazySingletonGiantDragon.getInstance();
        //都是同一个对象
        System.out.println(g1 == g2);
        System.out.println(g2 == g3);

        //懒汉式，是延迟加载的方式，只有使用的时候才会加载。 并且有线程安全的考量(鉴于同学们学习的进度，暂时不对线程的章节做展开)。
        //使用懒汉式，在启动的时候，会感觉到比饿汉式略快，因为并没有做对象的实例化。 但是在第一次调用的时候，会进行实例化操作，感觉上就略慢。

        //什么是单例模式？回答的时候，要答到三元素
        //1. 构造方法私有化
        //2. 静态属性指向实例
        //3. public static的 getInstance方法，返回第二步的静态属性


    }

}
