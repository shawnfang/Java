package ClassAndObject;

public class PropertyInitclass {

    //对象属性初始化
    // 声明该属性的时候进行初始化
    public String name = "xiaoxiaofang";
    protected float hp;
    float maxXp;

    {
        //对象属性初始化
        // 初始化块
        maxXp = 100;
    }

    //对象属性初始化
    //构造方法中初始化
    public PropertyInitclass() {
        hp = 1000;
        System.out.println("构造函数初始化，并打印hp的值："+hp);
    }

    // 类属性初始化
    public static int itemCapacity = 8;

    // 类属性块初始化
    static {
        itemCapacity = 100;
        System.out.println("类初始化的时候打印itemCapacity:"+itemCapacity);
    }

    public static void main(String[] args) {
        PropertyInitclass propertyInitclass =new PropertyInitclass();

    }
}
