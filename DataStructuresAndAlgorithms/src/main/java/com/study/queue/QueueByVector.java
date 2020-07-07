package com.study.queue;

import java.util.Vector;

public class QueueByVector<T> implements QueueInterface<T> {
    private Vector<T> queue;
    private int maxSize = 10;

    public QueueByVector(){
        queue = new Vector<T>(maxSize);
    }

    public void enqueue(T newEntry) {
        queue.addElement(newEntry);
    }

    public T dequeue() {
        T front = null;
        if (!isEmpty()) {
            front = getFront();
            queue.remove(getFront());
        }else {
            System.out.println("当前队列为空");
        }
        return front;
    }

    public T getFront() {
        T getFrontResult = null;
        if (!isEmpty()) {
            getFrontResult = queue.get(0);
        }
        return getFrontResult;
    }

    public boolean isEmpty() {
        boolean isEmptyResult = false;
        if (queue.size() == 0) {
            isEmptyResult = true;
        }
        return isEmptyResult;
    }

    public void clear() {

    }

    public static void main(String[] args) {
        QueueByVector<String> queueByVector = new QueueByVector<String>();
        queueByVector.enqueue("a");
        queueByVector.enqueue("b");
        queueByVector.enqueue("c");
        queueByVector.enqueue("d");
        System.out.println("获取当前头部节点");
        System.out.println(queueByVector.getFront());
        System.out.println("删除节点");
        queueByVector.dequeue();
        System.out.println("获取当前头部节点");
        System.out.println(queueByVector.getFront());
        queueByVector.enqueue("x");
        queueByVector.enqueue("y");
        queueByVector.enqueue("z");
        queueByVector.enqueue("e");
        System.out.println("删除节点");
        System.out.println(queueByVector.dequeue());
        System.out.println("删除节点");
        System.out.println(queueByVector.dequeue());
        System.out.println("删除节点");
        System.out.println(queueByVector.dequeue());
        System.out.println("删除节点");
        System.out.println(queueByVector.dequeue());
        System.out.println("获取当前头部节点");
        System.out.println(queueByVector.getFront());
        System.out.println("删除节点");
        System.out.println(queueByVector.dequeue());
        System.out.println("删除节点");
        System.out.println(queueByVector.dequeue());
        System.out.println("获取当前头部节点1");
        System.out.println(queueByVector.getFront());
        System.out.println("删除节点");
        System.out.println(queueByVector.dequeue());
        System.out.println("获取当前头部节点2");
        System.out.println(queueByVector.getFront());
    }
}
