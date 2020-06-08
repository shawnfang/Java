package com.study.linearlist;
/*
数据结构与算法分析 java语言描述
第五章课后项目设计练习 第1题，完成ExpandableArraryList类的实现
主要实现特性：使用动态扩展数组实现ADT线性表
 */
public class ExpandableArraryList<T> implements AdtList<T>{

    private T[] entry;
    private int length;
    private static final int Max_Size = 2;

    public ExpandableArraryList(){
        this(Max_Size);
    }

    public ExpandableArraryList(int max_size) {
        length = 0;
        entry = (T[]) new Object[max_size];
    }

    private void doubleArrary(){
        T[] oldArrary = entry;
        int oldLength = oldArrary.length;
        entry =(T[]) new Object[oldLength*2];
        for (int i = 0; i < oldLength; i++) {
            entry[i]=oldArrary[i];
        }
        System.out.println("扩展数组完成的长度："+entry.length);
    }

    public boolean add(T newEntry) {
        boolean isSuccessfully = true;
        if(isFull()){
            doubleArrary();
            System.out.println("满了，继续扩展数组");
        }
        entry[length] = newEntry;
        length++;
        return isSuccessfully;
    }

    public boolean add(int newPosition, T newEntry) {
        boolean isSuccessfully = false;
        if(isFull()){
            System.out.println("插入操作，数组满了继续扩展数组");
            doubleArrary();
        }
        if(newPosition>length+1){
            return isSuccessfully;
        }
        if(newPosition < 1){
            return isSuccessfully;
        }
        for (int i=length;i>=newPosition;i--){
            entry[i] = entry[i-1];
        }
        entry[newPosition-1]=newEntry;
        length++;
        isSuccessfully = true;
        return isSuccessfully;
    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessfully = true;
        if (givenPosition < 0 && givenPosition> length) {
            doubleArrary();
        }else {
            entry[givenPosition-1] = newEntry;
        }
        return isSuccessfully;
    }

    public T getEntry(int givenPosition) {
        T result = null;
        if (isEmpty()) {
            return result;
        }
        if (givenPosition<0 && givenPosition>length ) {
            return result;
        }else {
            result = entry[givenPosition-1];
        }
        return result;
    }

    public boolean contains(T anEntry) {
        boolean isSuccessfully = false;
        for (int i = 0; i < length; i++) {
            if (entry[i] == anEntry) {
                isSuccessfully = true;
                break;
            }
        }
        return isSuccessfully;
    }


    public T remove(int givePosition) {
        T result = null;
        if(givePosition<0 | givePosition>length){
            System.out.println("非法的删除");
            return null;
        }
        if(isEmpty()){
            System.out.println("空表");
            return null;
        }
        result = entry[givePosition-1];
        for(int i=givePosition-1;i<=length;i++){
            entry[i] = entry[i+1];
        }
        length--;
        return result;
    }

    public void clean() {
        length = 0;
    }


    public int getSize() {
        return length;
    }

    public boolean isEmpty() {
        return length==0;
    }

    public boolean isFull() {
        return length==entry.length;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(entry[i]);
        }
    }

    public static void main(String[] args) {
        ExpandableArraryList<String> i = new ExpandableArraryList<String>();
        System.out.println(i.Max_Size);
        i.add("a");
        i.add("b");
        i.add("c");
        i.add("d");
        i.add("e");
        i.add("f");
        i.add("gg");
        i.add("h");
        i.add(1,"ss");
        i.add(5,"mm");
        i.add(3,"kk");
        i.display();
        System.out.println(i.length);


    }
}
