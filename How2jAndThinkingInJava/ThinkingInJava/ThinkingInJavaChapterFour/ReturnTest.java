package ThinkingInJava.ThinkingInJavaChapterFour;

// return后不再继续执行
// 两个用途 一，指定方法返回什么值；二，导致当前的方法退出
// 返回void的方法中没有return语句
public class ReturnTest {
    static  int test(int testval,int target){
        if (testval > target) {
            return  +1;
        }else if (testval < target) {
            return  -1;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10,5));
        System.out.println(test(5,10));
        System.out.println(test(5,5));
    }
}
