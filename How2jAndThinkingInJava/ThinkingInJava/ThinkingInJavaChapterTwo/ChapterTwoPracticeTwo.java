package ThinkingInJava.ThinkingInJavaChapterTwo;


//练习三，找出含有ATypeName的代码段，改成完整程序
public class ChapterTwoPracticeTwo {
    public static void main(String[] args) {
        class ATypeName{
            int a;
            char b;
        }
        ATypeName AT = new ATypeName();
        System.out.println(AT.a);
        System.out.println(AT.b);
    }
}
