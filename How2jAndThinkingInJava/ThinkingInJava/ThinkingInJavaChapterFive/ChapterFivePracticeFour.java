package ThinkingInJava.ThinkingInJavaChapterFive;

public class ChapterFivePracticeFour {
    public ChapterFivePracticeFour() {
        System.out.println("这是一条来自无参数构造器打印的一条消息！");
    }

    public ChapterFivePracticeFour(String s) {
        System.out.println("这个参数s的值是： " + s);
        System.out.println("这是一条来自重载构造器打印的一条消息！");
    }

    public static void main(String[] args) {
        new ChapterFivePracticeFour();
        new ChapterFivePracticeFour("重载");
    }
}
