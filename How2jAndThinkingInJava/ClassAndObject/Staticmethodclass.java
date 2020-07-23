package ClassAndObject;

public class Staticmethodclass {

    private String name;
    private int hp;
    private int age;

    // 对象方法，实例方法
    // 通过对象调用
    //  如果方法里访问了对象属性，那么这个方法，就必须设计为对象方法
    public void die() {
        hp = 0;
        System.out.println(hp);
    }

    // 类方法，静态方法
    // 类直接调用
    //  如果一个方法，没有调用任何对象属性，那么就可以考虑设计为类方法
    public static void battleWin() {
        System.out.println("battle win");
    }

    public static void main(String[] args) {
        Staticmethodclass ST = new Staticmethodclass();

        // 通过对象访问对象方法
        ST.die();

        // 通过类访问类方法
        Staticmethodclass.battleWin();
    }
}
