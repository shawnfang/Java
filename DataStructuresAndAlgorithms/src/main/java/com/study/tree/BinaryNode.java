package com.study.tree;

public class BinaryNode<T> implements BinaryNodeInterface<T> {
    private T data;
    private BinaryNode<T> leftNode;
    private BinaryNode<T> rightNode;
    public BinaryNode(){
        this(null);
    }
    public BinaryNode(T dataPosition){
        this(dataPosition,null,null);
    }
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
        int leftNumber = 0;
        int rightNumber = 0;
        if (leftNode != null) {
            leftNumber = leftNode.getNumberOfNodes();
        }
        if (rightNode != null) {
            rightNumber = rightNode.getNumberOfNodes();
        }
        return 1+leftNumber+rightNumber;
    }

    public int getHeight() {
        return getHeight(this);
    }

    private int getHeight(BinaryNode<T> node){
        int height = 0;
        if (node != null) {
            height = 1+Math.max(getHeight(node.leftNode),getHeight(node.rightNode));
        }
        return height;
    }

    public BinaryNodeInterface<T> copy() {
        return null;
    }
}
