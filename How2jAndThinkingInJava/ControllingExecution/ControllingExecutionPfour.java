package ControllingExecution;

public class ControllingExecutionPfour {
    public static void main(String[] args) {
        int a;
        int b;
        for (int i = 1; i < 100; i++) {
            for (int j = 2; j <= i; j++) {
                if( j < i){
                    if(j%i==0){
                        System.out.println("这是一个合数" + i);
                    }
                }else {
                    System.out.println("这是一个质素:"+ i );
                    System.out.println("这是一个:"+ j );
                }
            }
        }
    }
}
