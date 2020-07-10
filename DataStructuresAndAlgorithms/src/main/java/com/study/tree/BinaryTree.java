package com.study.tree;

import java.util.Iterator;

public class BinaryTree<T> implements BinaryTreeInterface<T> {
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

    /*
    中序遍历
     */
   public void inorderTraverse(){
        inorderTraverse(root);
   }

   private void inorderTraverse(BinaryNodeInterface<T> node){
        if (node != null) {
            inorderTraverse(node.getLeftChild());
            System.out.println(node.getData());
            inorderTraverse(node.getRightChild());
        }
    }

    /*
    先序遍历
     */
    public void preorderTraverse(){
        preorderTraverse(root);
    }
    private void preorderTraverse(BinaryNodeInterface<T> node){
        if (node != null) {
            System.out.println(node.getData());
            preorderTraverse(node.getLeftChild());
            preorderTraverse(node.getRightChild());
        }
    }

    /*
    后序遍历
     */
    public void postorderTraverse(){
        postorderTraverse(root);
    }

    private void postorderTraverse(BinaryNodeInterface<T> node){
        if (node != null) {
            postorderTraverse(node.getLeftChild());
            postorderTraverse(node.getRightChild());
            System.out.println(node.getData());
        }
    }

    public void setTree(T rootData) {
        root = new BinaryNode<T>(rootData);
    }

    public void setTree(BinaryNodeInterface<T> leftNode, BinaryNodeInterface<T> rightNode) {
        root.setLeftChild(leftNode);
        root.setRightChild(rightNode);
    }

    public void setLeftTree(BinaryNodeInterface<T> leftNode) {
        root.setLeftChild(leftNode);
    }

    public void setRightTree(BinaryNodeInterface<T> rightNode) {
        root.setRightChild(rightNode);
    }

    public Iterator<T> getPreorderIterator() {
        return null;
    }

    public Iterator<T> getPostorderIterator() {
        return null;
    }

    public Iterator<T> getInorderIterator() {
        return null;
    }

    public Iterator<T> getLevelOrderIterator() {
        return null;
    }




    public static void main(String[] args) {
        BinaryTree<String> binaryTree = new BinaryTree<String>("a");
        System.out.println(binaryTree.getRootData());
        BinaryTree<String> binaryTree1 = new BinaryTree<String>("x");
        BinaryTree<String> binaryTree2 = new BinaryTree<String>("y");
        BinaryTree<String> binaryTree3 = new BinaryTree<String>("z",binaryTree1,binaryTree2);
        BinaryTree<String> binaryTree5 = new BinaryTree<String>("uu");
        BinaryTree<String> binaryTree6 = new BinaryTree<String>("qq");
        BinaryTree<String> binaryTree7 = new BinaryTree<String>("tt");
        BinaryTree<String> binaryTree8 = new BinaryTree<String>("yy");
        BinaryTree<String> binaryTree9 = new BinaryTree<String>("xxx",binaryTree5,binaryTree6);
        BinaryTree<String> binaryTree10 = new BinaryTree<String>("ytt",binaryTree7,binaryTree8);
        binaryTree1.setLeftTree(binaryTree9.root);
        binaryTree1.setRightTree(binaryTree10.root);
        System.out.println(binaryTree3.getRootData());
        System.out.println(binaryTree3.root.getLeftChild().getData());
        System.out.println(binaryTree3.root.getRightChild().getData());
        System.out.println(binaryTree3.getHeight());
        System.out.println(binaryTree3.getNumberOfNodes());
        System.out.println("中序遍历");
        binaryTree3.inorderTraverse();
        System.out.println("后序遍历");
        binaryTree3.postorderTraverse();
        System.out.println("前序遍历");
        binaryTree3.preorderTraverse();
    }

}
