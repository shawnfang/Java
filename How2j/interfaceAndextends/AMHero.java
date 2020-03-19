package interfaceAndextends;

import objectOriented.Hero;

public class AMHero extends HeroBoss implements magicHero,physicHero,Mortal {
    @Override
    public void die() {
        System.out.println("这是AMHero的die方法");
    }

    @Override
    public void magicAttack() {
        System.out.println("这是一个魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("这是一个新的物理攻击方法");
    }

    public static void main(String[] args) {
        AMHero AM = new AMHero();
        AM.magicAttack();
        AM.physicAttack();

        HeroBoss H = new HeroBoss();
        AMHero AMH =new AMHero();
        AMH = (AMHero)H;

        magicHero MC = AM;




    }
}
