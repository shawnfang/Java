package InterfaceAndExtends;

public class PhysicWapon extends Wapon {

    public PhysicWapon(){
        System.out.println("这是一个物理攻击武器的无参构造方法");
    }
    public PhysicWapon(String name){
        super(name);
        System.out.println("这是PhysicWapon的构造方法");
    }

    public PhysicWapon(String name,int moveSpeed){
        this.name = name;
        this.moveSpeed = moveSpeed;
        System.out.println("这是一个没有使用super的构造方法");
    }


    // 调用父类方法
    @Override
    public void setAttrackSpeed(int attrackSpeed) {
        super.setAttrackSpeed(attrackSpeed);
    }

    @Override
    public int getAttrackSpeed() {
        return super.getAttrackSpeed();
    }

    // 调用父类属性
    public float  getMoveSpeed(){
        return super.moveSpeed;
    }

    public static void main(String[] args) {
        new PhysicWapon("倚天剑");
        new PhysicWapon("打狗棍",1000);
        PhysicWapon p = new PhysicWapon();
        System.out.println(p.toString());
        p.setAttrackSpeed(100);
        p.getAttrackSpeed();
    }
}
