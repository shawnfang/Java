package objectOriented;

// 创建类
public class Item {

    // 类属性
    String name;
    int price;
    float armor;
    int moveSpeed;

    // (void)无返回类型的类方法
    public void attrack(){
        // 方法的具体实现
        System.out.println("这是一个类方法");
    }
    // (int,float,String) 返回这些类型的类方法
    public int getPrice(){
        return price;
    }

    public static void main(String[] args) {
        //实例类对象
        Item potion = new Item();  
        potion.name= "血瓶";
        potion.price =50;
         
        Item shoe = new Item();
        shoe.name= "草鞋";
        shoe.price =300;
         
        Item sword = new Item();   
        sword.name= "长剑";
        sword.price =350;
        System.out.println(sword.name);
         
    }
}