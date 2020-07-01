package com.study.sortPrimary;

import java.util.Arrays;

/*
十一章 排序入门--插入排序
 */
public class InsertionSort {
    public static void insertSort(int[] a,int first,int last){
        for (int i = first+1; i <= last; i++) {
            int firstUnsort = a[i];
            insertForOrder(firstUnsort,a,first,i-1);
        }
        System.out.println(Arrays.toString(a));
    }

    // 方法一
    public static void insertInOrder(int firstUnsort,int a[],int first,int end){
        int index = end;
        while ((index>=first) && (firstUnsort<a[index])){
            a[index+1]=a[index];
            index--;
        }
        a[index+1] = firstUnsort;
    }

    //方法二
    public static void insertForOrder(int firstUnsort,int a[],int first,int end){
        for (int i = end; i >= first ; i--) {
            if (firstUnsort < a[i]) {
                a[i+1]=a[i];
                a[i] = firstUnsort;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {9,6,2,4,8,10,1,34,98,25,7};
        insertSort(a,0,10);
    }
}
