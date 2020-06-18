package com.study.linklist;
/* 第七章 链表实现
项目设计的第五题
 */
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
        if (newPosition<0 || newPosition>length+2 || isEmpty()) {
            result = false;
            return result;
        }
        if (newPosition == 1) { // 插入头部
            improveNode.setNextNode(firstNode);
            firstNode = improveNode;
        }else if(newPosition == length+1){  //插入末尾
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
        ImproveNode improveNode = new ImproveNode(newEntry);
        improveNode.setNextNode(firstNode);
        firstNode = improveNode;
        length++;
    }

    public void addLast(Object newEntry) {
        ImproveNode improveNode = new ImproveNode(newEntry);
        lastNode.setNextNode(improveNode);
        lastNode = improveNode;
        length++;
    }

    public Object removeFirst() {
        T nodeData = null;
        nodeData = (T)firstNode.getData();
        firstNode = firstNode.getNextNode();
        length--;
        return nodeData;
    }

    public Object removeLast() {
        T nodeData = (T)lastNode.getData();
        lastNode = getNodeAt(getSize()-1);
        length--;
        return nodeData;
    }

    public Object getFirst() {
        T firstNodeData = null;
        if (length == 0) {
            return firstNodeData;
        }else {
            firstNodeData = (T) firstNode.getData();
        }
        return firstNodeData;
    }

    public Object getLast() {
        T lastNodeData = null;
        if (lastNode == null) {
            return lastNodeData;
        }else {
            lastNodeData = (T)lastNode.getData();
        }
        return lastNodeData;
    }

    public void moveToEnd() {
        ImproveNode tempNode;
        tempNode = firstNode;
        firstNode = firstNode.getNextNode();
        lastNode.setNextNode(tempNode);
        lastNode = tempNode;

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
        newLinkList.add(3,"x");
        System.out.println(newLinkList.lastNode.getData());
        newLinkList.display();
        System.out.println("替换");
        newLinkList.replace(2,"tt");
        newLinkList.display();
        System.out.println(newLinkList.contains("as"));
        System.out.println("设置头部节点");
        newLinkList.addFirst("fxx");
        System.out.println(newLinkList.lastNode.getData());
        newLinkList.display();
        System.out.println("设置尾部节点");
        newLinkList.display();
        newLinkList.addLast("tailxx");
        System.out.println(newLinkList.getEntry(6));
        System.out.println(newLinkList.length);
        newLinkList.display();
        System.out.println("移除首节点");
        System.out.println(newLinkList.removeFirst());
        newLinkList.display();
        System.out.println("移除末尾节点");
        System.out.println(newLinkList.removeLast());
        newLinkList.display();
        System.out.println(newLinkList.lastNode.getData());
        System.out.println("首节点移动到末尾");
        newLinkList.moveToEnd();
        newLinkList.display();
        System.out.println("显示末尾节点是否正确");
        System.out.println(newLinkList.lastNode.getData());
    }
}
