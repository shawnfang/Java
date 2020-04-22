package ThinkingInJava.ThinkingInJavaChapterFive;
class Dog{
    // 方法重载
    public void bark(){
        System.out.println("这是一个无参数方法");
    }
    public void bark(int i){
        System.out.println("这是第一个带参数方法");
        System.out.println("第"+i+"条狗的叫声是：狗吠");
    }
    public void bark(String s){
        System.out.println("这是第二个带参数方法");
        System.out.println("狗狗"+s+"的叫声是：咆哮");
    }
    // 重载方法中，参数类型以及名字都一样，但是参数顺序不同，可以视为两个不同的方法
    public void bark(String s,int i){
        System.out.println("这是第二个带参数方法");
        System.out.println("第"+i+"条狗狗"+s+"的叫声是：咆哮");
    }
    public void bark(int i,String s){
        System.out.println("这是第二个带参数方法");
        System.out.println("狗狗"+s+"的编号是"+i+"号");
    }

}
public class ChapterFivePracticeFiveAndSix {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.bark(1);
        d.bark("虾条");
        d.bark(1,"大牛");
        d.bark("大饼",100);
    }
}
