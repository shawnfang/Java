package classAndObject;

public class HungrySingletonTestGiantDragon {
    public static void main(String[] args){
        //通过new实例化会报错
        //GiantDragon g = new GiantDragon();

        //只能通过getInstance得到对象
        HungrySingletonGiantDragon g1 = HungrySingletonGiantDragon.getInstance();
        HungrySingletonGiantDragon g2 = HungrySingletonGiantDragon.getInstance();
        HungrySingletonGiantDragon g3 = HungrySingletonGiantDragon.getInstance();

        //都是同一个对象
        System.out.println(g1 == g2);
        System.out.println(g2 == g3);

        //饿汉式是立即加载的方式，无论是否会用到这个对象，都会加载。
        //如果在构造方法里写了性能消耗较大，占时较久的代码，比如建立与数据库的连接，那么就会在启动的时候感觉稍微有些卡顿。
    }
}
