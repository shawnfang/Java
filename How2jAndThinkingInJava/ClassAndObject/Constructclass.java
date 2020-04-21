package ClassAndObject;

public class Constructclass extends Heroclass {
    float hp;
    float armor;
    String name;

    // 隐式构造方法，一般不写出来，作为默认构造方法，如果有了带参构造方法，隐式构造方法就失效了
    public  Constructclass(){

    }

    // 显示构造方法，构造方法与类名一致，没有返回类型
    public  Constructclass(String Cname){
        name = Cname;
    }

    // 构造方法重载，与普通方法的重载一样
    public  Constructclass(String Cname,float Chp){
        hp = Chp;
        name = Cname;
    }

    public static void main(String[] args){
        // 实例化对象的时候必然会调用构造方法
        Constructclass C = new Constructclass("超级英雄");
        System.out.println(C.name);
    }
}
