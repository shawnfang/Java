package ThinkingInJava.ThinkingInJavaChapterFive;
class ConstructorTestThis{
    String s = "helloworld";
    ConstructorTestThis(){
        this("helloworld");
    }
    ConstructorTestThis(String ss){
        System.out.println("我是一个被调用的构造器，s的值是："+ss);
    }
    ConstructorTestThis(String m,int f){
        this(m);
        System.out.println("这个构造器的m: " + m+" 构造器的f是："+f);
    }
}
public class ChapterFivePracticeNine {
    public static void main(String[] args) {
        System.out.println(new ConstructorTestThis());
        System.out.println(new ConstructorTestThis("2020",100));
    }
}
