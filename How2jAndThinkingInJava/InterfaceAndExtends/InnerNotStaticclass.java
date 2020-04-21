package InterfaceAndExtends;

public class InnerNotStaticclass {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    // 非静态内部类，只有一个外部类对象存在的时候才有意义
    class BattleScore{
        int kill;
        int die;
        int assit;
        public void legendary(){
            if(kill >= 8 )
                System.out.println(name+"超神");
            else
                System.out.println(name+ "尚未超神");
        }
    }

    public static void main(String[] args) {
        // 实例化外部类
        InnerNotStaticclass garen = new InnerNotStaticclass();
        garen.name = "盖盖";
        // 实例化内部类，是建立在外部类上进行实例的
        BattleScore BS =garen.new BattleScore();
        BS.kill = 9;
        BS.legendary();
    }
}
