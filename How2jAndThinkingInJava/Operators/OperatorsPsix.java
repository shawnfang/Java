package Operators;

import java.util.Random;

public class OperatorsPsix {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(2);
        System.out.println("当前的数字是：" + number);
        if(number == 0){
            System.out.println("这是正面");
        }else {
            System.out.println("这是反面");
        }
    }
}
