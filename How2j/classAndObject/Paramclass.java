package classAndObject;

public class Paramclass {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public  Paramclass(){

    }

    public  void  huixue(int xp){
        hp = hp + xp;
        System.out.println(hp);
        xp = 0;
        System.out.println(xp);
    }

    public  Paramclass(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    public void attack(Paramclass pc,int damage){
        pc.hp = pc.hp - damage;
    }


    public static void main(String[] args){
        Paramclass teem = new Paramclass("timo",222);
        //基本类型传参
        //在方法内，无法修改方法外的基本类型参数
        int xueping = 100;
        teem.huixue(xueping);
        System.out.println(teem.hp);

        Paramclass garen = new Paramclass("garen",1000);
        Paramclass ximo = new Paramclass("ximo", 500);
        garen.attack(ximo,200);
        System.out.println(ximo.hp);

    }

}
