package ObjectOriented.ThinkingInJavaChapterTwo;

// 完善storage代码段，学会调用方法并传值
// 练习6
public class ChapterTwoPracticeFive {
    String name;

    int storage(String s){
        return s.length() * 2;
    }

    public static void main(String[] args) {
        ChapterTwoPracticeFive cp = new ChapterTwoPracticeFive();
        cp.name = "shawnfang";
        System.out.println(cp.storage(cp.name));
    }
}
