package com.study.linearlist;
/*
数据结构与算法分析 java语言描述
第五章
主要实现特性：使用定长数组实现ADT线性表
 */
public class AdtArraryList<T> implements  AdtList<T> {

    private T[] entry;
    private int length;
    private static final int Max_Size = 50;

    public AdtArraryList(){
        this(Max_Size);
    }

    public AdtArraryList(int max_size) {
        length = 0;
        entry = (T[]) new Object[max_size];
    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean isSuccessfully = true;
        if (givenPosition < 0 && givenPosition> length) {
            isSuccessfully = false;
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

    public boolean add(T newEntry) {
        boolean isSuccessfully = true;
        if(!isFull()){
            entry[length] = newEntry;
            length++;
        }else {
            isSuccessfully = false;
        }
        return isSuccessfully;
    }

    public boolean add(int newPosition, T newEntry) {
        boolean isSuccessfully = false;
        if(isFull()){
            return isSuccessfully;
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
        AdtArraryList<String> i = new AdtArraryList<String>();
        System.out.println(i.Max_Size);
        i.add("a");
        i.add("b");
        i.add("c");
        i.add("d");
        i.add("e");
        i.add("f");
        System.out.println("是否包含某个元素："+ i.contains("cs"));
        System.out.println(i.length);
        i.add(1,"s");
        i.display();
        System.out.println("这是要删除的对象："+i.remove(6));
        i.display();
        System.out.println("这是列表的长度："+i.getSize());
        System.out.println("是否为空："+i.isEmpty());
        System.out.println("是否已经满了："+i.isFull());
        i.replace(6,"abc");
        i.display();
        System.out.println("获取列表中某个位置的元素："+i.getEntry(4));
        i.clean();
        System.out.println("是否已经清空："+i.isEmpty());
    }
}
