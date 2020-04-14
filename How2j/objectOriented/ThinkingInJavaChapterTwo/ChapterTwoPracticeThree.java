package objectOriented.ThinkingInJavaChapterTwo;

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
