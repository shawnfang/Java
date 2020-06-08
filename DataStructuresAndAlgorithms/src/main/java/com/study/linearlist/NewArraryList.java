package com.study.linearlist;

import java.util.ArrayList;
public class NewArraryList<T> implements AdtList<T> {

    private ArrayList<T> list;
    private static final int initialCapacity= 2;
    public NewArraryList(int initialCapacity){
        list = new ArrayList<T>(initialCapacity);
    }
    public NewArraryList(){
        this(initialCapacity);
    }

    public boolean add(T newEntry) {
        return list.add(newEntry);
    }

    public boolean add(int newPosition, T newEntry) {
        boolean successFully = true;
        if(newPosition>=1 && newPosition<=list.size()+1){
            list.add(newPosition-1,newEntry);
        }else {
            successFully = false;
        }
        return successFully;
    }

    public Object remove(int givePosition) {
        T result = null;
        if (givePosition>=1 && givePosition <= list.size()+1) {
            if (!list.isEmpty()) {
                result = list.remove(givePosition-1);
            }
        }
        return result;
    }

    public void clean() {
        list.clear();
    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean successFully = true;
        if(givenPosition>=1 && givenPosition<=list.size()+1 ){
            if(!isEmpty()){
                list.set(givenPosition-1,newEntry);
            }else {
                successFully = false;
            }
        }
        return successFully;
    }

    public Object getEntry(int givenPosition) {
        T result = null;
        if(givenPosition>=1 && givenPosition<list.size()+1){
            if(!list.isEmpty()){
                result = list.get(givenPosition-1);
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
        NewArraryList<String> newArraryList = new NewArraryList();
        newArraryList.add("a");
        newArraryList.add("b");
        newArraryList.add("c");
        newArraryList.display();
        System.out.println("~~~~~~~~~分割线~~~~~~~~~~~");
        System.out.println(newArraryList.add(4,"s"));
        newArraryList.display();
        System.out.println("~~~~~~~~~分割线~~~~~~~~~~~");
        System.out.println(newArraryList.remove(4));
        newArraryList.display();
        System.out.println(newArraryList.getSize());
    }
}
