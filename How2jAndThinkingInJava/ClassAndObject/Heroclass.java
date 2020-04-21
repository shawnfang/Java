package ClassAndObject;

public class Heroclass {
    int hp;
    String name;

    public static void main(String[] args){
        // 创建对象，无法访问
        new Heroclass();

        // 创建对象，并使用h 进行引用（h 引用并指向这个对象）
        Heroclass h = new Heroclass();
        Heroclass h1 = h;
        Heroclass h2 = h1;
        System.out.println(h);
        System.out.println(h1);
        System.out.println(h2);

        Heroclass h3 = new Heroclass();
        Heroclass h4 = h3;
        h4 = h2;
        System.out.println(h3);
        System.out.println(h4);

    }

}
