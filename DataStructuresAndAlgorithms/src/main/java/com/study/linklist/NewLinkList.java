package com.study.linklist;

import com.study.linearlist.AdtList;

public class NewLinkList<T> implements AdtList<T>,LinkListInterface<T> {
    private ImproveNode firstNode;
    private int length;
    private ImproveNode lastNode;

    public NewLinkList(){
        firstNode = null;
        length = 0;
        lastNode = null;
    }

    private ImproveNode getNodeAt(int nodePosition){
        ImproveNode improveNode = firstNode;
        if (nodePosition<0 || nodePosition>length) {
            return null;
        }
        if (isEmpty()) {
            return null;
        }
        for (int i = 1; i < nodePosition; i++) {
            improveNode = improveNode.getNextNode();
        }
        return improveNode;
    }

    public boolean add(T newEntry) {
        boolean result = true;
        ImproveNode improveNode = new ImproveNode(newEntry);
        if(isEmpty()){
            firstNode = improveNode;
            System.out.println("为空的时候添加成功");
            System.out.println(firstNode.getData());
        }else {
            lastNode.setNextNode(improveNode);
            System.out.println("添加成功");
            System.out.println(lastNode.getData());
        }
        lastNode = improveNode;
        length++;
        return result;
    }

    public boolean add(int newPosition, T newEntry) {
        boolean result = true;
        ImproveNode improveNode = new ImproveNode(newEntry);
        if (newPosition<0 || newPosition>length+1 || isEmpty()) {
            result = false;
            return result;
        }
        if (newPosition == 1) { // 插入头部
            improveNode.setNextNode(firstNode);
            firstNode = improveNode;
        }else if(newPosition == length){  //插入末尾
            lastNode.setNextNode(improveNode);
            lastNode = improveNode;
        } else { // 插入中间
            ImproveNode frontImporveNode = getNodeAt(newPosition-1);
            ImproveNode backImproveNode = getNodeAt(newPosition);
            frontImporveNode.setNextNode(improveNode);
            improveNode.setNextNode(backImproveNode);
        }
        length++;
        return result;
    }

    public Object remove(int givePosition) {
        T result = null;
        if (givePosition == 1) {
            firstNode = getNodeAt(givePosition+1);
            result = (T)firstNode.getData();
        }else if(givePosition>1 || givePosition<length){
            ImproveNode beforeNode = getNodeAt(givePosition-1);
            ImproveNode backNode = getNodeAt(givePosition+1);
            beforeNode.setNextNode(backNode);
            result = (T)getNodeAt(givePosition).getData();
        }else {
            result = (T)lastNode.getData();
            ImproveNode beforeNode = getNodeAt(givePosition-1);
            lastNode = beforeNode;
        }
        return result;
    }

    public void clean() {

    }

    public boolean replace(int givenPosition, T newEntry) {
        boolean replaceResult = true;
        if (givenPosition<1 || givenPosition>length) {
            replaceResult = false;
        }else {
            getNodeAt(givenPosition).setData(newEntry);
        }
        return replaceResult;
    }

    public Object getEntry(int givenPosition) {
        return (T)getNodeAt(givenPosition).getData();
    }

    public boolean contains(T anEntry) {
        boolean result = false;
        for (int i = 0; i < length; i++) {
            if (getEntry(i).equals(anEntry)) {
               result = true;
            }
        }
        return result;
    }

    public int getSize() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return false;
    }

    public void display() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= length ; i++) {
            stringBuffer.append(getNodeAt(i).getData()+" ");
        }
        System.out.println(stringBuffer);
    }

    public void addFirst(Object newEntry) {

    }

    public void addLast(Object newEntry) {

    }

    public Object removeFirst() {
        return null;
    }

    public Object removeLast() {
        return null;
    }

    public Object getFirst() {
        return null;
    }

    public Object getLast() {
        return null;
    }

    public void moveToEnd() {

    }

    public static void main(String[] args) {
        NewLinkList<String> newLinkList = new NewLinkList<String>();
        newLinkList.add("a");
        newLinkList.add("b");
        newLinkList.add("c");
        System.out.println(newLinkList.length);
        newLinkList.display();
        System.out.println(newLinkList.getEntry(1));
        System.out.println("插入数据");
        newLinkList.add(4,"x");
        newLinkList.display();
        System.out.println("替换");
        newLinkList.replace(2,"tt");
        newLinkList.display();
        System.out.println(newLinkList.contains("as"));
    }
}
