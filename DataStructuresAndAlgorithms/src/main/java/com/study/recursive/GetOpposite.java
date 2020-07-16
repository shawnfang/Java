package com.study.recursive;

/*
数据结构与算法分析 java语言描述
第七章 递归
练习题的第五题  反向打印给定数组；
 */
public class GetOpposite {
    public void arrOpposite(String[] stringArr, int last){
        if (last >= 0 ) {
            System.out.println(stringArr[last]);
            arrOpposite(stringArr,last-1);
        }
    }

    public static void main(String[] args) {
        GetOpposite getOpposite = new GetOpposite();
        String[] a = {"a","b","c"};
        getOpposite.arrOpposite(a,2);

    }
}
