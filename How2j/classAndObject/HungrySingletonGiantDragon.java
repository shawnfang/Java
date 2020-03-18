package classAndObject;

public class HungrySingletonGiantDragon {
    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private HungrySingletonGiantDragon(){

    }
    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    private static HungrySingletonGiantDragon instance = new HungrySingletonGiantDragon();
    //public static 方法，提供给调用者获取12行定义的对象
    public static HungrySingletonGiantDragon getInstance(){
        return  instance;
    }
}
