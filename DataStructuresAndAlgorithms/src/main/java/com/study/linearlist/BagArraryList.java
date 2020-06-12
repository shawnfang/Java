package com.study.linearlist;
/*
数据结构与算法分析 java语言描述
第五章课后项目设计练习 第5题
通过第四章中设计的ADT背包接口实现类，并且新增交集，并集，差集的方法操作
 */
public class BagArraryList<T> implements BagAdtList<T> {

    private T[] entry;
    private int length;
    private static final int Max_Size = 5;

    public BagArraryList(){
        this(Max_Size);
    }

    public BagArraryList(int max_size) {
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
            result = entry[givenPosition];
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
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            stringBuffer.append(entry[i]+" ");
        }
        System.out.println("显示全部元素：");
        System.out.println(stringBuffer);
    }

    //并集
    public BagAdtList unionSet(BagAdtList<T> newList) {
        BagArraryList<T> newBagArraryList = new BagArraryList<T>();
        if(isFull()){
            doubleArrary();
            System.out.println("满了，继续扩展数组");
        }
        for (int i = 0; i < newList.getSize(); i++) {
            newBagArraryList.add((T)newList.getEntry(i));
        }
        for (int j = 0; j < getSize(); j++) {
            newBagArraryList.add((T)entry[j]);
        }
        newBagArraryList.display();
        return newBagArraryList;
    }

    //交集
    public BagAdtList intersect(BagAdtList<T> newList) {
        int tempSize = 0;
        BagArraryList<T>  IntersectBagArraryList = new BagArraryList<T>();
        for (int i = 0; i < newList.getSize(); i++) {
            if (contains((T)newList.getEntry(i))) {
                IntersectBagArraryList.add((T)newList.getEntry(i));
            }
        }
        IntersectBagArraryList.display();
        return IntersectBagArraryList;
    }

    //差集
    public BagAdtList except(BagAdtList<T> newList) {
        BagArraryList<T>  exceptBagArraryList = new BagArraryList<T>();
        for (int i = 0; i < newList.getSize(); i++) {
            if (!contains((T)newList.getEntry(i))) {
                exceptBagArraryList.add((T)newList.getEntry(i));
            }
        }
        for (int j = 0; j < getSize() ; j++) {
            if (!newList.contains((T)getEntry(j))) {
                exceptBagArraryList.add((T)getEntry(j));
            }
        }
        exceptBagArraryList.display();
        return exceptBagArraryList;
    }

    public static void main(String[] args) {
        BagArraryList<String> i = new BagArraryList<String>();
        System.out.println(i.Max_Size);
        i.add("a");
        i.add("x");
        i.add("y");
        i.add("d");
        i.add("a");
        i.add("f");
        System.out.println("是否包含某个元素："+ i.contains("cs"));
        System.out.println(i.length);
        i.add(1,"s");
        i.display();
        System.out.println("这里是另外一个新数组");
        BagArraryList<String> i2 = new BagArraryList<String>();
        i2.add("x");
        i2.add("y");
        i2.add("z");
        i2.add("a");
        i2.display();
        System.out.println("开始并集操作");
        i2.unionSet(i);
        System.out.println("新增元素");
        i2.add("xyz");
        i2.display();
        i.intersect(i2);
        i.except(i2);
    }
}
