package ThinkingInJava.ThinkingInJavaChapterFour;

// 任何返回一个数组的方法都可以使用foreach语法
public class ForEachString {
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray()
        ) {
            System.out.println(c + "");
        }
    }
}
