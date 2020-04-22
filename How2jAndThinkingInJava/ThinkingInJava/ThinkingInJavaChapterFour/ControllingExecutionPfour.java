package ThinkingInJava.ThinkingInJavaChapterFour;
// 获取质素
public class ControllingExecutionPfour {
    public static void main(String[] args) {
        int a=0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                if(i%j==0 & j!=1){
                    a=0;
                    break;
                }else {
                    a = i;
                }
            }
            if(a!=0) {
                    System.out.println("这是一个质素:"+ a );
                }
            }
        }
    }

