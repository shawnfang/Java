package ThinkingInJava.ThinkingInJavaChapterTwo;


// 创建一个类，包含了int,char 域，他们都没有被初始化，将他们的值打印出来，以验证Java执行了默认初始化
//练习1
public class ChapterTwoPracticeOne {
    int a;
    char b;

    public static void main(String[] args) {
        ChapterTwoPracticeOne c = new ChapterTwoPracticeOne();
        System.out.println("a等于："+c.a);
        System.out.println("b等于："+c.b);
    }
}
