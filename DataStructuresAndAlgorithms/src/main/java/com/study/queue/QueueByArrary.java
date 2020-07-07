package com.study.queue;

public class QueueByArrary<T> implements QueueInterface<T> {
    private T[] queueArrary;
    private int frontIndex;
    private int backIndex;
    private int maxSize = 10;

    public QueueByArrary(){
        queueArrary = (T[]) new Object[maxSize];
        frontIndex = 0;
        backIndex = 0;
    }
    private int queueLength(){
        return (backIndex-frontIndex+maxSize)%maxSize;
    }

    private boolean isFull(){
        boolean isFull = false;
        if (queueLength() != 0) {
            if((backIndex+1)%maxSize == frontIndex) {
                isFull = true;
            }
        }
        return isFull;
    }

    public void enqueue(T newEntry) {
        if (!isFull()) {
            queueArrary[backIndex] = newEntry;
            if (backIndex == maxSize-1) {
                backIndex = 0;
            }else {
                backIndex++;
            }
        }else {
            System.out.println("队列已满，无法继续入队操作");
        }
    }

    public T dequeue() {
        T removeResult = null;
        if (!isEmpty()) {
            removeResult = queueArrary[frontIndex];
            queueArrary[frontIndex] = null;
            if(frontIndex == maxSize-1){
                frontIndex = 0;
            }else {
            frontIndex++;
            }
        }else {
            System.out.println("队列已空，返回null");
        }
        return removeResult;
    }

    public T getFront() {
        return queueArrary[frontIndex];
    }

    public boolean isEmpty() {
        boolean isEmptyResult = false;
        if (frontIndex == 0 && backIndex == 0) {
            isEmptyResult = true;
        }
        return isEmptyResult;
    }

    public void clear() {

    }

    public static void main(String[] args) {
        QueueByArrary<String> queueByArrary = new QueueByArrary<String>();
        queueByArrary.enqueue("s");
        queueByArrary.enqueue("a");
        queueByArrary.enqueue("b");
        queueByArrary.enqueue("c");
        queueByArrary.enqueue("d");
        queueByArrary.enqueue("e");
        queueByArrary.enqueue("f");
        queueByArrary.enqueue("g");
        queueByArrary.enqueue("h");
        System.out.println(queueByArrary.getFront());
        System.out.println("当前队列长度");
        System.out.println(queueByArrary.queueLength());
        System.out.println("删除操作");
        System.out.println(queueByArrary.dequeue());
        System.out.println("节点添加1");
        queueByArrary.enqueue("i");
        System.out.println("节点添加2");
        queueByArrary.enqueue("j");
        System.out.println("获取当前头部节点");
        System.out.println(queueByArrary.getFront());
        System.out.println("删除操作");
        System.out.println(queueByArrary.dequeue());
        System.out.println("获取当前头部节点");
        System.out.println(queueByArrary.getFront());
        System.out.println(queueByArrary.dequeue());
        System.out.println(queueByArrary.dequeue());
        System.out.println(queueByArrary.dequeue());
        queueByArrary.enqueue("x");
        queueByArrary.enqueue("y");
        queueByArrary.enqueue("z");
        System.out.println("删除操作");
        System.out.println(queueByArrary.dequeue());
        System.out.println("获取当前头部节点");
        System.out.println(queueByArrary.getFront());
        System.out.println(queueByArrary.queueLength());
        System.out.println(queueByArrary.frontIndex);
        System.out.println(queueByArrary.backIndex);
    }
}
