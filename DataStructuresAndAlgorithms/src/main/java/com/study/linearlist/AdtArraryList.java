package com.study.linearlist;

public class AdtArraryList<T> implements  AdtList<T> {

    private T[] entry;
    private int length;
    private static final int Max_Size = 50;

    /*
    private void makeRoom(int newPosition){
        for (int index=length;index>=newPosition;index--){
            entry[index] = entry[index--];
        }
    }
    */

    public AdtArraryList(){
        this(Max_Size);
    }

    public AdtArraryList(int max_size) {
        length = 0;
        entry = (T[]) new Object[max_size];
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
        for(int i=givePosition-1;i<length;i++){
            entry[i] = entry[i+1];
        }
        length--;
        return result;
    }

    public void clean() {

    }

    public boolean replace(int givenPosition, T newEntry) {
        return false;
    }

    public T getEntry(int givenPosition) {
        return null;
    }

    public boolean contains(T anEntry) {
        return false;
    }

    public int getLength() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public void display() {
        for (int i = 0; i <= length; i++) {
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
        System.out.println(i.length);
        i.add(1,"s");
        i.display();
        System.out.println("这是要删除的对象："+i.remove(2));
        i.display();
    }
}
