package com.study.recursive;

public class RecursiveTest {
    public void countUp(int n){
        System.out.println(n);
        if (n < 10) {
            countUp(n+1);
        }
    }
    public int sumOf(int n){
        if(n == 1){
            return n;
        }
        return sumOf(n-1)+n;
    }
    public static void main(String[] args) {
        RecursiveTest recursiveTest = new RecursiveTest();
        recursiveTest.countUp(1);
        System.out.println("测试递归累加：");
        System.out.println(recursiveTest.sumOf(4));
    }
}
