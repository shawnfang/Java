package com.study.tree;

public class BinaryNode<T> implements BinaryNodeInterface<T> {
    private T data;
    private BinaryNode<T> leftNode;
    private BinaryNode<T> rightNode;
    public BinaryNode(T dataPosition,BinaryNode<T> leftChildNode,BinaryNode<T> rightChildNode){
        data = dataPosition;
        leftNode = leftChildNode;
        rightNode = rightChildNode;
    }
    public T getData() {
        return data;
    }

    public void setData(T newData) {
        data = newData;
    }

    public BinaryNodeInterface<T> getLeftChild() {
        return leftNode;
    }

    public BinaryNodeInterface<T> getRightChild() {
        return rightNode;
    }

    public void setLeftChild(BinaryNodeInterface<T> leftChild) {
        leftNode = (BinaryNode<T>) leftChild;
    }

    public void setRightChild(BinaryNodeInterface<T> rightChild) {
        rightNode = (BinaryNode<T>) rightChild;
    }

    public boolean hasLeftChild() {
        return leftNode!=null;
    }

    public boolean hasRightChild() {
        return rightNode!=null;
    }

    public boolean isLeaf() {
        return (rightNode==null)&&(leftNode==null);
    }

    public int getNumberOfNodes() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }

    public BinaryNodeInterface<T> copy() {
        return null;
    }
}
