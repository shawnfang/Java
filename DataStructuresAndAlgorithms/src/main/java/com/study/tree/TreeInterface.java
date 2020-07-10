package com.study.tree;

public interface TreeInterface<T> {
    /**
     * 获取节点的数据
     * @return
     */
    public T getRootData();

    /**
     * 获取树的高度
     * @return
     */
    public int getHeight();

    /**
     * 获取节点数量
     * @return
     */
    public int getNumberOfNodes();

    /**
     * 是否为空
     * @return
     */
    public boolean isEmpty();

    /**
     * 清空树
     */
    public void clear();
}
