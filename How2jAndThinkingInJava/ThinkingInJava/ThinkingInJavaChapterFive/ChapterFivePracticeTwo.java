package ThinkingInJava.ThinkingInJavaChapterFive;

public class ChapterFivePracticeTwo {
    static String f = "abc";
    String s;

    public ChapterFivePracticeTwo(){
        s = "xyz";
    }
    public static void main(String[] args) {
        System.out.println(f);
        ChapterFivePracticeTwo cfpt = new ChapterFivePracticeTwo();
        System.out.println(cfpt.s);
    }
}
