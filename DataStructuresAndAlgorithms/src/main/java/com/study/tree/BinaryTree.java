package com.study.tree;

import java.util.Iterator;

public class BinaryTree<T> implements TreeInterface<T> {
    private BinaryNodeInterface<T> root;
    public BinaryTree(){
        root =null;
    }
    private BinaryTree(T rootData){
        root = new BinaryNode<T>(rootData);
    }

    private BinaryTree(T rootData,BinaryTree<T> leftTree,BinaryTree<T> rightTree){
        root = new BinaryNode<T>(rootData);
        root.setLeftChild((BinaryNodeInterface<T>) leftTree.root);
        root.setRightChild((BinaryNodeInterface<T>) rightTree.root);
    }

    public T getRootData() {
        T resultData = null;
        if (root != null) {
            resultData = root.getData();
        }
        return resultData;
    }

    public int getHeight() {
        return root.getHeight();
    }

    public int getNumberOfNodes() {
        return root.getNumberOfNodes();
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree<String> binaryTree = new BinaryTree<String>("a");
        System.out.println(binaryTree.getRootData());
        BinaryTree<String> binaryTree1 = new BinaryTree<String>("x");
        BinaryTree<String> binaryTree2 = new BinaryTree<String>("y");
        BinaryTree<String> binaryTree3 = new BinaryTree<String>("z",binaryTree1,binaryTree2);
        System.out.println(binaryTree3.getRootData());
        System.out.println(binaryTree3.root.getLeftChild().getData());
        System.out.println(binaryTree3.root.getRightChild().getData());
        System.out.println(binaryTree3.getHeight());
        System.out.println(binaryTree3.getNumberOfNodes());

    }
}
