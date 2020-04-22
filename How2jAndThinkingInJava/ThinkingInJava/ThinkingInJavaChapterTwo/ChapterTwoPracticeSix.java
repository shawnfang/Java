package ThinkingInJava.ThinkingInJavaChapterTwo;


//展示自动包装功能对所有的基本类型和包装器类型都起作用。
public class ChapterTwoPracticeSix {
    public static void main(String[] args) {
        long a = 100000;
        int b = 10;
        short c = 1;
        double d = 1.00;
        boolean e = false;
        float g = (float) 0.1;
        char f = 'a';
        byte bt = 8;

        Long a1 =a;
        System.out.println(a1);
        System.out.println(a);
        Integer b1 = b;
        System.out.println(b1);
        System.out.println(b);
        Short c1 = c;
        System.out.println(c1);
        System.out.println(c);
        Double d1 = d;
        System.out.println(d1);
        System.out.println(d);
        Boolean e1 = e;
        System.out.println(e1);
        System.out.println(e);
        Float g1 = g;
        System.out.println(g1);
        System.out.println(g);
        Character f1 = f;
        System.out.println(f1);
        System.out.println(f);
        Byte bt1 = bt;
        System.out.println(bt1);
        System.out.println(bt);
    }
}
