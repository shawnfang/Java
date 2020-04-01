package interfaceAndExtends;

import java.net.PortUnreachableException;

public class HeroBoss {
    public String name;
    public int hp;
    public float moveSpeed;
    public int age;
    static String copyright;

    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
    }

    public void attrack(){
        System.out.println("这是一个普通攻击");
    }

    public  void kill(Mortal m){
        m.die();
    }
    public HeroBoss(){

    }
    public HeroBoss(String name){
       this.name = name;
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
