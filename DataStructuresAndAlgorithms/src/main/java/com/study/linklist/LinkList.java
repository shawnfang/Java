package com.study.linklist;

import com.study.linearlist.AdtList;

public class LinkList<T> implements AdtList<T> {

    public class Node<T> {
        private T data;
        private Node next;

        private Node(T dataPortion){
            data = dataPortion;
            next = null;
        }
        private Node(T dataPortion, Node nextNode){
            data = dataPortion;
            next = nextNode;
        }

        public Node getNext() {
            return next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node firstNode;
    private int length;

    public LinkList(){
        clear();
    }
    public final void clear(){
        firstNode = null;
        length = 0;
    }

    private Node getNodeAt(int givenPosition){
        Node positionNode = firstNode;
        if (givenPosition<1 || givenPosition>length) {
            System.out.println("无效获取");
            return positionNode;
        }
        if ((isEmpty())) {
            return positionNode;
        }
        for (int i = 1; i < givenPosition; i++) {
            System.out.println("获取节点");
            System.out.println(positionNode.data);
            positionNode = positionNode.next;
        }
        return positionNode;
    }

    public boolean add(Object newEntry) {
        Node newNode = new Node(newEntry);
        if ((isEmpty())) {
            firstNode = newNode;
            System.out.println(firstNode.data);
            System.out.println("第一个节点添加成功");
        }else {
            Node lastNode = getNodeAt(length);
            lastNode.next = newNode;
            System.out.println(lastNode.data);
            System.out.println("节点添加成功");
        }
        length++;
        return true;
    }

    public boolean add(int newPosition, Object newEntry) {
        boolean result = true;
        Node newNode = new Node(newEntry);
        if (newPosition<1 || newPosition>length) {
            System.out.println("插入失败");
            result = false;
            return result;
        }
        if (newPosition == 1) {
            Node frontNode = getNodeAt(newPosition);
            firstNode = newNode;
            newNode.next = frontNode;
        }else {
            Node beforeNode = getNodeAt(newPosition - 1);
            System.out.println("前一个节点：" + beforeNode.data);
            Node lastNode = getNodeAt(newPosition);
            System.out.println("后一个节点：" + lastNode.data);
            beforeNode.next = newNode;
            newNode.next = lastNode;
        }
        length++;
        return result;
    }

    public Object remove(int givePosition) {
        T result = null;
        if (givePosition<1 || givePosition > length) {
            System.out.println("非法移除");
            return result;
        }
        if (givePosition == 1) {
            result = (T)firstNode.data;
            firstNode = firstNode.next;
        }else if(givePosition>1 && givePosition<length) {
            Node beforPosition = getNodeAt(givePosition-1);
            Node afterPosition = getNodeAt(givePosition+1);
            beforPosition.next = afterPosition;
            result = (T)getNodeAt(givePosition).data;
        }else {
            Node beforPosition = getNodeAt(givePosition-1);
            beforPosition.next = null;
            result = (T)getNodeAt(givePosition-1).data;
        }
        length--;
        return result;
    }

    public void clean() {

    }

    public boolean replace(int givenPosition, Object newEntry) {
        boolean successfully = true;
        if (givenPosition<1 || givenPosition >length || isEmpty()) {
            successfully = false;
        }else{
            getNodeAt(givenPosition).data = newEntry;
        }
        return successfully;
    }

    public Object getEntry(int givenPosition) {
        T result = null;
        if (givenPosition<1 || givenPosition >length || isEmpty() ) {
            return result;
        }else {
            result = (T)getNodeAt(givenPosition).data;
        }
        return result;
    }

    public boolean contains(Object anEntry) {
        boolean contains = false;
        Node tempNode = firstNode;
        for (int i = 1; i < length ; i++) {
            tempNode = tempNode.next;
            if (tempNode.data == anEntry) {
                contains = true;
            }
        }
        return contains;
    }

    public int getSize() {
        return length;
    }

    public boolean isEmpty() {
        return length==0;
    }

    public boolean isFull() {
        return false;
    }

    public void display() {
        StringBuffer stringBuffer = new StringBuffer();
        Node node = firstNode;
        stringBuffer.append(node.data+ " ");
        for (int i = 1; i < length ; i++) {
            node = node.next;
            stringBuffer.append(node.data+" ");
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        LinkList<String> stringLinkList = new LinkList<String>();
        stringLinkList.add("a");
        stringLinkList.add("c");
        stringLinkList.add("x");
        stringLinkList.add("y");
        stringLinkList.add("z");
        System.out.println(stringLinkList.length);
        stringLinkList.display();
        stringLinkList.add(2,"b");
        stringLinkList.display();
        stringLinkList.add("ts");
        stringLinkList.display();
        System.out.println("移除操作1：");
        System.out.println(stringLinkList.remove(1));
        stringLinkList.display();
        System.out.println("移除操作2：");
        System.out.println(stringLinkList.remove(3));
        stringLinkList.display();
        System.out.println("移除操作3：");
        System.out.println(stringLinkList.remove(5));
        stringLinkList.display();
        System.out.println("替换数据：");
        stringLinkList.replace(4,"xxx");
        stringLinkList.display();
        System.out.println(stringLinkList.getEntry(4));
        System.out.println(stringLinkList.contains("cd"));
    }
}
