package com.study.stack;

public class StackByArrary<T> implements StackInterface<T> {
    private T[] stack;
    private int top;
    private int Maxsize = 10;

    public StackByArrary(){
        stack = (T[]) new Object[Maxsize];
        top = -1;
    }
    public boolean cleanStack() {
        boolean cleanResult = true;
        if (!emptyStack()) {
            for (int i = 0; i < top; i++) {
                stack[top] = null;
            }
            top = -1;
        }else {
            cleanResult = false;
        }
        return cleanResult;
    }

    public boolean popStack() {
        boolean popResult = true;
        if (!emptyStack()) {
            stack[top] = null;
            top--;
        }else {
            popResult = false;
        }
        return popResult;
    }

    public boolean pushStack(T newEntry) {
        boolean pushResult = true;
        if (top != Maxsize) {
            stack[top+1] = newEntry;
            top++;
        }else {
            pushResult = false;
        }
        return pushResult;
    }

    // 获取栈顶元素
    public T getTopStack() {
        if (!emptyStack()) {
            return stack[top];
        }else {
            return null;
        }
    }

    // 是否为空
    public boolean emptyStack() {
        boolean empty=true;
        if (top != -1) {
            empty = false;
        }
        return empty;
    }

    public int getLengthStack() {
        if (top == -1) {
            return 0;
        }else {
            return top+1;
        }
    }

    public boolean destroyStack() {
        return false;
    }

    public static void main(String[] args) {
        StackByArrary<Integer> stackByArrary = new StackByArrary();
        stackByArrary.pushStack(1);
        stackByArrary.pushStack(3);
        stackByArrary.pushStack(5);
        stackByArrary.pushStack(8);
        System.out.println(stackByArrary.getLengthStack());
        System.out.println(stackByArrary.getTopStack());
        stackByArrary.popStack();
        System.out.println(stackByArrary.getTopStack());
        stackByArrary.cleanStack();
        System.out.println(stackByArrary.getLengthStack());
    }
}
