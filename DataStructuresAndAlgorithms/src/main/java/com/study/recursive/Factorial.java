package com.study.recursive;

/*
数据结构与算法分析 java语言描述
第七章 递归
练习题的第四题  n的阶乘，使用两种方法实现
 */

public class Factorial {
    public int fac1(int n){
        if(n < 1){
            return 1;
        }
        return fac1(n-1)*n;
    }

    public int fac2(int n){
        if (n > 0){
            return fac2(n-1)*n;
        }
        return 1;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fac2(3));
    }
}
