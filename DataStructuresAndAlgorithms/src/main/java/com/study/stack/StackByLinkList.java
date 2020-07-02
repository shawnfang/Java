package com.study.stack;

public class StackByLinkList<T> implements StackInterface<T> {
    private class Node<T>{
        private T data;
        private Node next;

        private Node(T dataPortion){
            data = dataPortion;
            next = null;
        }
        private Node(T dataPortion, StackByLinkList.Node nextNode){
            data = dataPortion;
            next = nextNode;
        }

        public void setNext(Node next) {
            this.next = next;
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
    }

    private Node top = null;
    private int count = 0;
    public boolean cleanStack() {
        return false;
    }

    public boolean popStack() {
        boolean popStackResult = true;
        if (emptyStack()) {
            popStackResult = false;
        }else {
            top.data = null;
            top = top.next;
            count--;
        }
        return popStackResult;
    }

    public boolean pushStack(T newEntry) {
        Node node = new Node(newEntry);
        node.next = top;
        top = node;
        count++;
        return true;
    }

    public T getTopStack() {
        T data = null;
        if (top != null) {
            data = (T) top.data;
        }
        return data;
    }

    public boolean emptyStack() {
        boolean emptyStackResult = false;
        if (top == null) {
            emptyStackResult = true;
        }
        return emptyStackResult;
    }

    public int getLengthStack() {
        return count;
    }

    public boolean destroyStack() {
        return false;
    }

    public static void main(String[] args) {
        StackByLinkList<Integer> stackByLinkList = new StackByLinkList<Integer>();
        stackByLinkList.pushStack(1);
        stackByLinkList.pushStack(2);
        stackByLinkList.pushStack(3);
        System.out.println(stackByLinkList.getTopStack());
        System.out.println(stackByLinkList.top.next.data);
        stackByLinkList.pushStack(8);
        stackByLinkList.pushStack(5);
        stackByLinkList.popStack();
        System.out.println(stackByLinkList.getTopStack());
    }
}
