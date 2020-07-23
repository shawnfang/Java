package ObjectOriented;

// 创建类
public class Item {

    // 类属性
    /*
    字段可以是任何类型的对象，可以通过其引用与其进行通信，也可以是基本类型的一种
    如果字段是某个对象的引用，那么必须初始化该引用，以便与一个实际对象关联
    */
    /*
    一切都是对象，但操纵的标识符实际上是对象的一个“引用”。
    比喻 遥控器（引用）操纵电视机（对象），没有对象的时候，引用也可以独立存在
    因为没有关联操作对象，所以给引用发送信息的时候会出现异常，最好在创建引用的时候便进行初始化
    */
    String name = "";
    int price;
    float armor;
    int moveSpeed;

    // (void)无返回类型的类方法
    public void attrack() {
        // 方法的具体实现
        System.out.println("这是一个类方法");
    }

    // (int,float,String) 返回这些类型的类方法
    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        //实例类对象
        // 引用与对象关联，通过new实现，告诉new给我一个对象。
        Item potion = new Item();
        potion.name = "血瓶";
        potion.price = 50;

        Item shoe = new Item();
        shoe.name = "草鞋";
        shoe.price = 300;

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;
        System.out.println(sword.name);

    }
}