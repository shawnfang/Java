package ClassAndObject;

public class Thisclass extends Heroclass {
    int age;
    String name;


    // this指的是当前对象
    public void showthis() {
        System.out.println("打印当前对象的地址:" + this);
    }

    public void setName(String name) {
        name = name;
    }

    public void setName2(String firstname) {
        name = firstname;
    }

    // this访问当前对象属性
    public void setName3(String name) {
        // name 代表的是参数
        // this.name 是访问属性name
        this.name = name;
    }


    public static void main(String[] args) {
        Thisclass t = new Thisclass();
        t.showthis();

        // 实例多个对象，并打印出来，看看this是否指向不同的对象地址
        Thisclass t1 = new Thisclass();
        t1.showthis();

        Thisclass t2 = new Thisclass();
        t2.setName("小王");
        System.out.println(t2.name);

        Thisclass t3 = new Thisclass();
        t3.setName2("小红");
        System.out.println(t3.name);

        Thisclass t4 = new Thisclass();
        t4.setName3("小花");
        System.out.println(t4.name);

    }
}
