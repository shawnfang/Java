package ThinkingInJava.ThinkingInJavaChapterFive;

class  TestThis{
    void method1(){
        System.out.println("这是第一个方法");
        System.out.println("s:"+ this.method2(1));
        System.out.println("s2: " + method2(100));
    }
    int method2(int i){
        return ++i;
    }
        }
public class ChapterFivePracticeEight {
    public static void main(String[] args) {
        TestThis t = new TestThis();
        t.method1();
    }
}
