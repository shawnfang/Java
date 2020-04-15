package objectOriented.ThinkingInJavaChapterTwo;

// 将INcremengtable的代码段改成一段完整程序
// 展示无论创建多少个类对象，在这个类中的static域都只有一个实例
// 练习7,8
public class ChapterTwoPracticeFour {
    static int i=10;

    static void increment(){
        System.out.println("直接用类名调用static的方法："+ChapterTwoPracticeFour.i);
    }
    public static void main(String[] args) {
        ChapterTwoPracticeFour c = new ChapterTwoPracticeFour();
        ChapterTwoPracticeFour c1 = new ChapterTwoPracticeFour();
        ChapterTwoPracticeFour c2 = new ChapterTwoPracticeFour();

        System.out.println("new一个对象打印i的值："+c.i);
        System.out.println("new第二个对象打印i值："+ c1.i);
        System.out.println("直接使用类名打印i值："+ChapterTwoPracticeFour.i);
        ChapterTwoPracticeFour.increment();
        c2.increment();
    }
}
