package com.study.search;

public class ArrarySortSearch {
    /**
     * 迭代顺序查找无序数组
     * @param ints
     * @param n
     * @return
     */
    public boolean iterativeDeepening(int[] ints, int n){
        boolean result = false;
        for (int i = 0; i < ints.length; i++) {
            if (n == ints[i]) {
                result = true;
            }
        }
        return result;
    }

    /**
     * 递归顺序查找无序数组
     * @param list
     * @param first
     * @param last
     * @param desireItem
     * @return
     */
    public static boolean recursiveIterativeDeepening(int[] list,int first, int last, int desireItem){
        boolean found = false;
        if (first > last) {
            found = false;
        }else if(list[first] == desireItem){
            found = true;
        }else {
            recursiveIterativeDeepening(list,first+1,last,desireItem);
        }
        return found;
    }

    public boolean recursiveSearch(int[] ints,int n){
        boolean result = false;
        if (recursiveIterativeDeepening(ints,0,ints.length-1,n)) {
            result = true;
        }
        return result;
    }

    /**
     * 递归查找有序数组（折半查找）
     * @param ints
     * @param first
     * @param last
     * @param n
     * @return
     */
    public boolean findInArray(int[] ints,int first,int last, int n){
        boolean result = false;
        int mid = ints.length/2;
        if (n == ints[mid]) {
            return true;
        }else if(n < ints[mid]){
            return findInArray(ints,first,mid,n);
        }else if(n > ints[mid]){
            return findInArray(ints,mid+1,last,n);
        }
        return result;
    }
}
