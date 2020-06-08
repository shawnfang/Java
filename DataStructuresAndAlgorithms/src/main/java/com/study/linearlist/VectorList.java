package com.study.linearlist;
/*
数据结构与算法分析 java语言描述
第五章课后项目设计练习 第2题，完成Vectorlist类的实现
主要实现：使用向量实现ADT线性表
 */
import java.util.Vector;
public class VectorList<T> implements AdtList<T> {

    private Vector<T> list;
    private static final int INITAL_CAPACITY=10;

    public VectorList(int initialSize){
        list = new Vector<T>(initialSize);
    }
    public VectorList(){
        this(INITAL_CAPACITY);
    }

    public boolean add(T newEntry) {
        return list.add(newEntry);
    }

    public boolean add(int newPosition, T newEntry) {
        boolean successFully = true;
        if ((newPosition>=1) && (newPosition<=list.size()+1)) {
            list.insertElementAt(newEntry, newPosition-1);
        }else {
            successFully = false;
        }
        return successFully;
    }

    public Object remove(int givePosition) {
        T result = null;
        if ((givePosition>=1) && givePosition<=list.size()+1) {
            if (!list.isEmpty()) {
                result = list.remove(givePosition-1);
            }else {
                return result;
            }
        }
        return result;
    }

    public void clean() {
       list.removeAllElements();

    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean successFully = true;
        if((givenPosition>=1)&&(givenPosition<=list.size()+1)){
            if(!list.isEmpty()) {
                list.set(givenPosition - 1, newEntry);
            }else {
                successFully = false;
            }
        }else {
            successFully = false;
        }

        return successFully;
    }

    public Object getEntry(int givenPosition) {
        T result = null;
        if ((givenPosition>=1) && (givenPosition<=list.size()+1)) {
            if (!list.isEmpty()) {
                result = list.get(givenPosition-1);
            }else {
                return result;
            }
        }
        return result;
    }

    public boolean contains(T anEntry) {
        return list.contains(anEntry);
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public void display() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(list.get(i)+" ");
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        VectorList<String> vectorList = new VectorList();
        vectorList.add("a");
        vectorList.add("b");
        vectorList.add("c");
        vectorList.display();
        System.out.println("分割线");
        System.out.println(vectorList.add(20,"ff"));
        vectorList.display();
    }
}
