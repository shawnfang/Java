package InterfaceAndExtends;

public class SupportHero extends HeroBoss {
    public String name;

    // 重写父类方法
    public void attrack() {
        System.out.println("这是一个辅助攻击");
    }

    public void supportAttack(){

        System.out.println("这是一个辅助英雄");
    }

}
