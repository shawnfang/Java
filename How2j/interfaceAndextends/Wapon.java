package interfaceAndextends;

public class Wapon {
    String name;
    int attrackSpeed;
    float moveSpeed;

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

    public static void main(String[] args) {
        new Wapon("屠龙刀");
    }
}
