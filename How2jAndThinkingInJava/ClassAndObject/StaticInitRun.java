package ClassAndObject;

public class StaticInitRun {
    public static final String INIT = "init";
    static {
            System.out.println("------StaticDemo----");
        }


    public void demo(){
        System.out.println("当调用这个方法的时候，会执行static代码块");
    }
}

/**
 * 调用的静态属性被final修饰的时候，不会执行static静态模块的代码
 *
 *
 */
class TestStatic {
    public static void main(String[] args) {
        System.out.println(StaticInitRun.INIT);
    }
}

/**
 * 当一个类主动使用时，会执行static静态模块代码
 * 例如
 * 类的实例化
 * 调用类中的静态方法
 * 当使用类或接口的静态字段时
 * 反射
 * 初始化某个子类
 * 标注为启动类
 */
class TestStatic2 {
    public static void main(String[] args) {
        StaticInitRun staticInitRun = new StaticInitRun();
        System.out.println(staticInitRun.INIT);
        staticInitRun.demo();
    }
}
