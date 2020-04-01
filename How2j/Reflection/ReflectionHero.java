package Reflection;

public class ReflectionHero {
    public String name;
    public float hp;
    public int damage;
    public int id;
    //为Hero增加一个静态属性,并且在静态初始化块里进行初始化，
    // 无论什么途径获取类对象，都会导致静态属性被初始化，而且只会执行一次。
    // （除了直接使用 Class c = Hero.class 这种方式，这种方式不会导致静态属性被初始化）
    static String copyright;

    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Hero [name=" + name + "]";
    }
    public boolean isDead() {
        // TODO Auto-generated method stub
        return false;
    }
    public void attackHero(ReflectionHero h2) {
        // TODO Auto-generated method stub

    }

}
