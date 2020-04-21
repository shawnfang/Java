package InterfaceAndExtends;

public abstract class Locationclass {
    String name;
    int hp;
    float armor;
    public abstract void attack();

    public static void main(String[] args) {

        // 这是一个本地类， 可以理解为一个有名字的匿名类
        class Someclass extends Locationclass{
            public void attack(){
                System.out.println(name+ "这又是一个新的攻击手段");
            }
        }

        Someclass S = new Someclass();
        S.name = "地卜师";
        S.attack();
    }

}
