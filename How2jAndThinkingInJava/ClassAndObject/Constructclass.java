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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArmor() {
        return armor;
    }

    public float getHp() {
        return hp;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Constructclass{" +
                "hp=" + hp +
                ", armor=" + armor +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args){
        // 实例化对象的时候必然会调用构造方法
        Constructclass C = new Constructclass("超级英雄");
        Constructclass cc = new Constructclass("ab",10);
        System.out.println(C);
        System.out.println(cc);
    }
}
