package interfaceAndExtends;

public class HeroBoss {
    public String name;
    public int hp;
    public float moveSpeed;
    public int age;

    public void attrack(){
        System.out.println("这是一个普通攻击");
    }

    public  void kill(Mortal m){
        m.die();
    }

    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public static void main(String[] args) {
        HeroBoss H = new HeroBoss();
        H.name = "gailun";
        AMHero AMH =new AMHero();
        APHero AP = new APHero();
        H.kill(AMH);
        H.kill(AP);
    }
}
