package com.study.dictionary;

import java.util.Iterator;
public class LinklistDictionary<K,V> implements DictionaryInterface<K,V> {
    private NodeEntry<K,V> firstNode;
    private int length;

    public LinklistDictionary(){
        firstNode = null;
        length = 0;
    }

    private NodeEntry getNodeAt(int givenPosition){
        NodeEntry positionNode = firstNode;
        if (givenPosition<1 || givenPosition>length) {
            System.out.println("无效获取");
            return positionNode;
        }
        if ((isEmpty())) {
            return positionNode;
        }
        for (int i = 1; i < givenPosition; i++) {
            System.out.println("获取节点");
            System.out.println(positionNode.getKey());
            positionNode = positionNode.getNext();
        }
        return positionNode;
    }

    private NodeEntry localIndex(K key) {
        NodeEntry positionNode = firstNode;
        NodeEntry  keyNode = null;
        if (length != 0) {
            for (int i = 1; i < length; i++) {
                positionNode = positionNode.getNext();
                if (positionNode.getKey() == key) {
                    keyNode = positionNode.getNext();
                    break;
                }
            }
        }
        return keyNode;
    }

    private int nodeIndex(K key) {
        NodeEntry positionNode = firstNode;
        int  keyNode = -1;
        if (length != 0) {
            for (int i = 1; i < length; i++) {
                positionNode = positionNode.getNext();
                if (positionNode.getKey() == key) {
                    keyNode = i;
                    break;
                }
            }
        }
        return keyNode;
    }


    @Override
    public V add(K key, V value) {
        V result = null;
        NodeEntry newEntry = new NodeEntry<K,V>(key,value);
        NodeEntry lastNode = getNodeAt(length);
        if (isEmpty()) {
            firstNode = newEntry;
            result = value;
        }else {
            lastNode.setNext(newEntry);
            result = value;
        }
        lastNode = newEntry;
        System.out.println(lastNode.getKey()+" "+lastNode.getValue());
        length++;
        return result;
    }

    @Override
    public V remove(K key) {
        V result = null;
        NodeEntry keyIndex = localIndex(key);
        if (keyIndex != null) {
            result = (V) keyIndex.getValue();
            NodeEntry beforNode = getNodeAt(nodeIndex(key)-1);
            beforNode.setNext(keyIndex.getNext());
            length--;
        }
        return result;
    }

    @Override
    public V getValue(K key) {
        V result = null;
        NodeEntry keyIndex = localIndex(key);
        if (keyIndex != null) {
            result = (V)keyIndex.getValue();
        }
        return result;
    }

    @Override
    public boolean contain(K key) {
        boolean containResult = false;
        NodeEntry keyIndex = localIndex(key);
        if (keyIndex != null) {
            containResult = true;
        }
        return containResult;
    }

    @Override
    public Iterator<K> getKeyIterator() {
        return null;
    }

    @Override
    public Iterator<V> getValueIterator() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmptyResult = false;
        if (length == 0) {
            isEmptyResult = true;
        }
        return isEmptyResult;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        LinklistDictionary<Integer,String> linklistDictionary = new LinklistDictionary<Integer, String>();
        linklistDictionary.add(1,"a");
        linklistDictionary.add(2,"b");
        linklistDictionary.add(3,"c");
        linklistDictionary.add(4,"d");
        System.out.println(linklistDictionary.remove(1));
        linklistDictionary.add(1,"x");
        System.out.println(linklistDictionary.getValue(3));
        System.out.println(linklistDictionary.contain(5));
    }
}
