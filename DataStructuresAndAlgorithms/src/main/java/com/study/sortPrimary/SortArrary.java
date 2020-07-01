package com.study.sortPrimary;
/*
十一章 排序入门--选择排序
 */
public class SortArrary {
    public static <T extends Comparable<? super T>> void recursiveSelectionSort(T[] a,int first,int last){
        if (first < last) {
            recursiveSelectionSort(a,first+1,last);
        }
        int indexOfMin = getIndexofMin(a,first);
        swap(a,first,indexOfMin);

    }
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
        StringBuffer stringBuffer = new StringBuffer();
        Integer[] ar = {9,6,2,4,8};
        System.out.println(SortArrary.getIndexofMin(ar,0));
        System.out.println("测试：");
        SortArrary.selectionSort(ar,5);
        System.out.println("测试2：");
        SortArrary.recursiveSelectionSort(ar,0,4);
        System.out.println("测试3：");
        for (int i:ar){
            stringBuffer.append(i+" ");
        }
        System.out.println(stringBuffer);

    }
}
