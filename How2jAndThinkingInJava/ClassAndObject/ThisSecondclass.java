package ClassAndObject;

public class ThisSecondclass {
    String name;
    int hp;
    int age;

    public ThisSecondclass(String name) {
        this.name = name;
    }

    public ThisSecondclass(String name, int hp) {
        this(name);
        this.hp = hp;
    }

    public ThisSecondclass(String name, int hp, int age) {
        this(name, hp);
        this.age = age;
    }

    public static void main(String[] args) {
        ThisSecondclass TS2 = new ThisSecondclass("小丁", 100, 20);
        System.out.println(TS2.name);
        System.out.println(TS2.hp);
        System.out.println(TS2.age);


        ThisSecondclass TS = new ThisSecondclass("小芳");
        System.out.println(TS.name);

        ThisSecondclass TS1 = new ThisSecondclass("小天", 100);
        System.out.println(TS1.name);
        System.out.println(TS1.hp);
        System.out.println(TS1.age);
    }
}
