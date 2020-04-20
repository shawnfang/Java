package ControllingExecution;
import static net.mindview.util.Range.*;

/*
break 强行退出循环，不执行循环中的剩余语句
continue 退出当前迭代，退出循环起始处，开始下一次迭代
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }
            if (i%9!=0) {
                continue;
            }
            System.out.println(i+" ");
        }
        for (int i: range(100)) {
            if (i == 74) {
                break;
            }
            if (i%9!=0) {
                continue;
            }
            System.out.println(i+" ");
        }
        int i=0;
        while (true){
            i++;
            int j = i * 27;
            if (j == 1269) {
                break;
            }
            if (j%10!=0) {
                continue;
            }
            System.out.println(i+"");
        }
    }
}
