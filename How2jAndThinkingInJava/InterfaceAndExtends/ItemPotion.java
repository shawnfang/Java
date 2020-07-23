package InterfaceAndExtends;

public class ItemPotion {
    String name;
    int price;

    public void buy() {
        System.out.println("购买");
    }

    public void effect() {
        System.out.println("物品使用效果");
    }

    public void useItem(ItemPotion I) {
        I.effect();
    }


    //要实现类的多态，需要如下条件
    //1. 父类（接口）引用指向子类对象
    //2. 调用的方法有重写
    public static void main(String[] args) {
        ItemPotion I = new ItemPotion();
        LifePotion L = new LifePotion();
        MagicPotion M = new MagicPotion();
        I.useItem(L);
        I.useItem(M);
        //L.effect();
        //M.effect();

    }
}
