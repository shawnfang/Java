package com.study.stack;

import java.util.Vector;

public class StackByVector<T> implements StackInterface<T> {
    private Vector<T> list;
    private int Inital_capacity = 10;

    public StackByVector(){
        list = new Vector<T>(Inital_capacity);
    }
    public boolean cleanStack() {
        boolean cleanStackResult = true;
        if (!emptyStack()) {
            System.out.println("当前是空的堆栈");
            cleanStackResult = false;
        }else {
            for (int i = list.size(); i >= 0; i--) {
                popStack();
                if (list.size() == 0) {
                    break;
                }
            }
        }
        return cleanStackResult;
    }

    public boolean popStack() {
        boolean popStackResult = true;
        if (!emptyStack()) {
            popStackResult = false;
            System.out.println("已经没有可以删除的对象了");
        }else{
            System.out.println(list.get(list.size()-1)+"被删除");
            list.remove(list.size()-1);

        }
        return popStackResult;
    }

    public boolean pushStack(T newEntry) {
        boolean pushStackResult = true;
        if (list.size() == Inital_capacity) {
            pushStackResult = false;
            System.out.println("堆栈已满无法继续添加");
        }else {
            list.add(newEntry);
        }
        return pushStackResult;
    }

    public T getTopStack() {
        return list.get(list.size()-1);
    }

    public boolean emptyStack() {
        boolean emptyStackResult = true;
        if (list.size()==0) {
            emptyStackResult = false;
            System.out.println("当前堆栈是空的");
        }
        return emptyStackResult;
    }

    public int getLengthStack() {
        return list.size();
    }

    public boolean destroyStack() {
        return false;
    }

    public static void main(String[] args) {
        StackByVector<Integer> stackByVector = new StackByVector<Integer>();
        stackByVector.pushStack(10);
        stackByVector.pushStack(12);
        stackByVector.pushStack(13);
        stackByVector.pushStack(14);
        stackByVector.popStack();
        System.out.println(stackByVector.getLengthStack());
        System.out.println(stackByVector.getTopStack());
        stackByVector.cleanStack();
        stackByVector.emptyStack();
    }
}
