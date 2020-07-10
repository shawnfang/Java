package com.study.tree;

public interface BinaryTreeInterface<T> extends TreeInterface<T>,TreeIteratorInterface<T> {
    /**
     * 将已有的二叉树设置为一棵新的二叉树
     * @param rootData 新树的根的数据对象
     */
    public void setTree(T rootData);

    /**
     * 将已有的二叉树设置为一棵新的二叉树
     * @param rootData 新树的根的数据对象
     * @param leftTree 新树的左子树
     * @param rightTree 新树的右子树
     */
    public void setTree(T rootData,BinaryTreeInterface<T> leftTree,BinaryTreeInterface<T> rightTree);
}
