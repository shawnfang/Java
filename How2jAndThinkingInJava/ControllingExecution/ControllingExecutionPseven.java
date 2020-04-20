package ControllingExecution;

public class ControllingExecutionPseven {
    static int testprint(int testval) {
        if (testval < 100) {
            return 1;
        } else {
            for (int i = 0; i < testval; i++) {
                System.out.println(i);
                if (i == 99) {
                    return 0;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i == 99) {
                break;
            }
            System.out.println(i+"");
        }

        testprint(1000);
    }
}
