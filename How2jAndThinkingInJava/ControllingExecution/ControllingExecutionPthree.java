package ControllingExecution;

import java.util.Random;

public class ControllingExecutionPthree {
    public static void main(String[] args) {
    Random rand = new Random();
    int beforeRandomCount = rand.nextInt();
    int afterRandomCount;
    while (true){
        int randomCount = rand.nextInt();
        if(beforeRandomCount < randomCount){
            System.out.println(randomCount);
            System.out.println(beforeRandomCount);
            System.out.println("当前产生的随机数小于上一个随机数");
            beforeRandomCount =randomCount;
        }else if(beforeRandomCount > randomCount){
            System.out.println(randomCount);
            System.out.println(beforeRandomCount);
            System.out.println("当前产生的随机数大于上一个随机数");
            beforeRandomCount =randomCount;
        }else{
            System.out.println(randomCount);
            System.out.println(beforeRandomCount);
            System.out.println("当前产生的随机数等于上一个随机数");
            beforeRandomCount =randomCount;
            }
        }
    }
}