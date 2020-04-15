package objectOriented.ThinkingInJavaChapterTwo;

// 将dataonly代码段改成一段程序，并在main方法中赋值，打印
// 练习5,6
public class ChapterTwoPracticeThree {
    public static void main(String[] args) {
        class DataOnly{
            int i;
            double q;
            boolean b;
        }
        DataOnly d = new DataOnly();
        d.i = 47;
        d.q = 100.00;
        d.b = true;
        System.out.println(d.i);
        System.out.println(d.q);
        System.out.println(d.b);
    }
}
