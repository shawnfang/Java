package com.study.linearlist;
/*
数据结构与算法分析 java语言描述
第五章课后项目设计练习 第4题
使用实现接口，忽略数组中的第一个存储单元，因此，线性表的第i个元素存放在数组中的索引为i的存储单元中。
 */
public class IgnoreFirstElem<T> implements AdtList<T> {

    private T[] list;
    private int size;
    private static final int Max_size = 2;

    public IgnoreFirstElem(int max_size){
        list = (T[]) new Object[max_size];
        size=0;
    }
    public IgnoreFirstElem(){
        this(Max_size);
    }
    private void addArraryLength(){
        T[] oldList = list;
        T[] newArrary = (T[])new Object[oldList.length*2];
        for (int i = 0; i < oldList.length; i++) {
             newArrary[i]=oldList[i];
        }
        list = newArrary;
        System.out.println(list.length);
    }
    public boolean add(T newEntry) {
        boolean successFully = true;
        if(size == list.length){
            addArraryLength();
        }
        if(size==0) {
            list[0] = newEntry;
            size++;
        }
        list[size] = newEntry;
        size++;
        return successFully;
    }

    public boolean add(int newPosition, T newEntry) {
        boolean successFully = true;
        if(size == list.length){
            addArraryLength();
        }
        if(newPosition>=1&&newPosition<=size){
            for (int i = size; i >= newPosition; i--) {
                list[i] = list[i-1];
            }
            list[newPosition] = newEntry;
            size++;
        }else {
            successFully = false;
        }
        return successFully;
    }

    public Object remove(int givePosition) {
        T result = null;
        if(givePosition>=1&&givePosition<size){
            result = list[givePosition];
            for (int i = givePosition; i < size; i++) {
                list[i]=list[i+1];
            }
            size--;
        }
        return result;
    }

    public void clean() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean successFully = true;
        if(givenPosition>=1&&givenPosition<size){
             list[givenPosition] = newEntry;
        }else {
            successFully = false;
        }
        return successFully;
    }

    public Object getEntry(int givenPosition) {
        T result = null;
        if(givenPosition>=1&&givenPosition<size){
            result = list[givenPosition];
        }
        return result;
    }

    public boolean contains(T anEntry) {
        boolean successFully = false;
        for (int i = 0; i < size; i++) {
            if(list[i].equals(anEntry)){
                successFully = true;
                break;
            }
        }
        return successFully;
    }

    public int getSize() {
        return size-1;
    }

    public boolean isEmpty() {
        return getSize()==0;
    }

    public boolean isFull() {
        return false;
    }

    public void display() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < size; i++) {
            stringBuffer.append(list[i]+" ");
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        IgnoreFirstElem<String> str = new IgnoreFirstElem<String>();
        str.add("abc");
        str.add("b");
        str.add("c");
        str.display();
        System.out.println();
        System.out.println("~~~~~~~~~~~~~分割线~~~~~~~~~~~~");
        System.out.println(str.getSize());
        str.add(4,"ss");
        str.display();
        System.out.println(str.size);
        System.out.println(str.getEntry(4));
        System.out.println(str.remove(2));
        str.display();
        System.out.println(str.getSize());
        str.replace(3,"xyz");
        str.display();
        System.out.println(str.contains("xyz1"));
    }
}
