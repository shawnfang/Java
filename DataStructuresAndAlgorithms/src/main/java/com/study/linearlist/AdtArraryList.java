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
        T[] list = (T[]) new Object[max_size];
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
            entry[i] = entry[i--];
        }
        entry[newPosition-1]=newEntry;
        length++;
        isSuccessfully = true;
        return isSuccessfully;
    }

    public T remove(int givePosition) {
        return null;
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
        AdtArraryList<Integer> i = new AdtArraryList<Integer>();
        System.out.println(i.length);

        i.add(1);
        i.add(2);
        i.display();
    }
}
