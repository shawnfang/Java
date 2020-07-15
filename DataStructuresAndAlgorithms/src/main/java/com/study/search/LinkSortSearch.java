package com.study.search;

import com.study.linklist.LinkList;
import com.study.linklist.LinkListInterface;

public class LinkSortSearch<T>extends LinkList implements LinkSearchInterface<T>, LinkListInterface {
    private Node firstNode;
    private int length;
    LinkList linkList = new LinkList();

    public LinkSortSearch(){
        clear();
    }

    /**
     * 迭代顺序查找无序链表
     * @param newEntry
     * @return
     */
    public boolean contain(T newEntry) {
        boolean result = false;
        Node tempNode = firstNode.getNext();
        for (int i = 0; i < linkList.getSize(); i++) {
            if (newEntry == tempNode.getData()) {
                result = true;
            }else {
                tempNode = tempNode.getNext();
            }
        }
        return result;
    }

    /**
     * 递归顺序查找无序链表
     * @param tempNode
     * @param newEntry
     * @return
     */
    public boolean recursiveContain(Node tempNode,T newEntry){
        boolean result = false;
        if (tempNode == null) {
            return result;
        }else if (tempNode.getData() == newEntry) {
            result = true;
        }else {
            tempNode = tempNode.getNext();
            recursiveContain(tempNode,newEntry);
        }
        return result;
    }

    /**
     * 顺序查找有序链表
     * @param newEntry
     * @return
     */
    public boolean sortLinkContain(T newEntry){
        Node tmpNode = firstNode;
        while (tmpNode !=null && (newEntry.toString().compareTo((String)tmpNode.getData()))>0){
            tmpNode = tmpNode.getNext();
        }
        return (tmpNode!=null && newEntry.equals(tmpNode.getData()));
    }

    public void addFirst(Object newEntry) {

    }

    public void addLast(Object newEntry) {

    }

    public Object removeFirst() {
        return null;
    }

    public Object removeLast() {
        return null;
    }

    public Object getFirst() {
        return null;
    }

    public Object getLast() {
        return null;
    }

    public void moveToEnd() {

    }
}
