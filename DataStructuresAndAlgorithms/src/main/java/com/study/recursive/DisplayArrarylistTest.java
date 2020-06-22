package com.study.recursive;

public class DisplayArrarylistTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        System.out.println("测试1：");
        DisplayArrarylistTest.displayArrarylist1(a,0,3);
        System.out.println("测试2：");
        DisplayArrarylistTest.displayArrarylist2(a,0,3);
        System.out.println("测试3：");
        DisplayArrarylistTest.displayArrarylist3(a,0,6);
    }
    public static void displayArrarylist1(int Arrarylist[],int first,int last){
        System.out.println(Arrarylist[first]);
        if (first < last) {
            displayArrarylist1(Arrarylist,first+1,last);
        }
    }
    public static void displayArrarylist2(int Arrarylist[],int first,int last){
        if (first <= last) {
            displayArrarylist2(Arrarylist,first,last-1);
            System.out.println(Arrarylist[last]);
        }
    }
    public static void displayArrarylist3(int Arrarylist[],int first,int last){
        if (first == last) {
            System.out.println(Arrarylist[first]);
        }else {
            int mid = (first+last)/2;
            displayArrarylist3(Arrarylist,first,mid);
            displayArrarylist3(Arrarylist,mid+1,last);
        }
    }
}
