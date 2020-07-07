package com.study.queue;

public class QueueByLinkList<T> implements QueueInterface<T>{
    private class Node<T>{
        private T data;
        private Node next;

        private Node(T dataPortion){
            data = dataPortion;
            next = null;
        }
        private Node(T dataPortion, QueueByLinkList.Node nextNode){
            data = dataPortion;
            next = nextNode;
        }
    }

    private Node firstNode;
    private Node backNode;
    public QueueByLinkList(){
        firstNode = null;
        backNode = null;
    }

    public void enqueue(T newEntry) {
        Node node = new Node(newEntry);
        if (isEmpty()) {
            firstNode = node;
            backNode= node;
        }else {
            backNode.next = node;
            backNode = node;
        }
    }

    public T dequeue() {
        T dequeueResult = null;
        if (!isEmpty()) {
            dequeueResult = (T) firstNode.data;
            firstNode.data = null;
            firstNode = firstNode.next;
        }else {
            System.out.println("当前队列为空");
        }
        return dequeueResult;
    }

    public T getFront() {
        T front = null;
        if ((T)firstNode != null) {
            front = (T)firstNode.data;
        }
        return front;
    }

    public boolean isEmpty() {
        boolean isEmptyResult = true;
        if (firstNode != null && backNode != null) {
            isEmptyResult = false;
        }
        return isEmptyResult;
    }

    public void clear() {

    }

    public static void main(String[] args) {
        QueueByLinkList<String> queueByLinkList = new QueueByLinkList<String>();
        queueByLinkList.enqueue("a");
        queueByLinkList.enqueue("b");
        queueByLinkList.enqueue("c");
        queueByLinkList.enqueue("e");
        queueByLinkList.enqueue("f");
        queueByLinkList.enqueue("g");
        queueByLinkList.enqueue("h");
        System.out.println(queueByLinkList.getFront());
        queueByLinkList.dequeue();
        System.out.println(queueByLinkList.getFront());
        queueByLinkList.dequeue();
        System.out.println(queueByLinkList.getFront());
        queueByLinkList.dequeue();
        System.out.println(queueByLinkList.getFront());
        queueByLinkList.dequeue();
        System.out.println(queueByLinkList.getFront());
        queueByLinkList.dequeue();
        System.out.println(queueByLinkList.getFront());
        queueByLinkList.dequeue();
        System.out.println(queueByLinkList.getFront());
        queueByLinkList.dequeue();
        System.out.println(queueByLinkList.getFront());
    }
}
