package com.study.sortPrimary;

public class sortArrary {
    public static <T extends Comparable<? super T>> void selectionSort(T[] a,int n){
        for (int i = 0; i < n-1 ; i++) {
            int indexOfMin = getIndexofMin(a,i);
            swap(a,i,indexOfMin);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    public static <T extends Comparable<? super T>> int getIndexofMin(T[] a,int first){
        T min = a[first];
        int minIndex = first;
        for (int i = first+1; i < a.length; i++) {
            if(min.compareTo(a[i]) > 0){
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void swap(Object[] a,int x,int y){
        Object temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] args) {
        Integer[] ar = {8,6,4,9,10,9,15,1};
        System.out.println(sortArrary.getIndexofMin(ar,0));
        System.out.println("测试：");
        sortArrary.selectionSort(ar,8);
    }
}
