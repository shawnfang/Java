package interfaceAndextends;

public class Wapon {
    String name;
    int attrackSpeed;
    float moveSpeed;
    final int hp=100;

    public Wapon(){
        System.out.println("这是一个无参数构造方法");
    }

    public Wapon(String name){
        this.name = name;
        System.out.println("这是一个有参数的构造方法");
    }

    public Wapon(String name,int attrackSpeed){
        this.name = name;
        this.attrackSpeed = attrackSpeed;
        System.out.println("这是一个有两个参数的构造方法");
    }

    public void setAttrackSpeed(int attrackSpeed) {
        this.attrackSpeed = attrackSpeed;
        System.out.println("我是父类的方法，专门给子类调用");
    }

    public int getAttrackSpeed() {
        System.out.println("我是父类的方法2，专门给子类调用");
        return attrackSpeed;
    }

    // final方法不能被继承的类进行重写
    public final float getMoveSpeeds(){
        return moveSpeed;
    }

    public static void main(String[] args) {
        new Wapon("屠龙刀");
    }
}
