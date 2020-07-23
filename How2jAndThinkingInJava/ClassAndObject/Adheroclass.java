package ClassAndObject;

public class Adheroclass extends Heroclass {

    public void attack() {
        System.out.println(name + "进行了一次攻击");
    }

    public void attack(Heroclass h) {
        System.out.println(name + "对" + h.name + "进行了一次攻击");
    }

    public void attack(Heroclass h1, Heroclass h2) {
        System.out.println(name + "对" + h1.name + "和" + h2.name + "进行了一次攻击");
    }

    public static void main(String[] args) {
        Adheroclass ah = new Adheroclass();
        ah.name = "赏金猎人";
        ah.attack();

        Adheroclass ah1 = new Adheroclass();
        ah1.name = "盖伦";
        ah1.attack(ah);
    }
}
