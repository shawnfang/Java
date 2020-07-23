package InterfaceAndExtends;

public class APHero extends HeroBoss implements physicHero, Mortal {
    @Override
    public void die() {
        System.out.println("这是APHero的die方法");
    }

    @Override
    public void physicAttack() {
        System.out.println("这是一个物理攻击");
    }

    //隐藏父类的battleWin方法
    public static void battleWin() {
        System.out.println("ap hero battle win");
    }

    public APHero(String name) {
        super(name);
    }

    public APHero() {

    }

    public static void main(String[] args) {
        APHero AP = new APHero();
        HeroBoss HB = new APHero();
        AP.hp = 100;
        AP.physicAttack();
        System.out.println(AP.hp);
        APHero.battleWin();
        HeroBoss.battleWin();
        HB.battleWin();

        // 接口默认的方法
        AP.revive();

    }
}
