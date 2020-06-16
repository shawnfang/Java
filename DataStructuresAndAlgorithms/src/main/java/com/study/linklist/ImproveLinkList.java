package com.study.linklist;
/* 第七章 链表实现
优化点:
1，使用get/set操作node;
2, 使用表尾引用，避免重复遍历查询
 */
import com.study.linearlist.AdtList;

public class ImproveLinkList<T> implements AdtList<T> {

    private ImproveNode firstNode;
    private int length;
    // 表尾引用
    private ImproveNode tempLastNode;

    public ImproveLinkList(){
        clear();
    }
    public final void clear(){
        firstNode = null;
        length = 0;
        tempLastNode = null;
    }

    private ImproveNode getNodeAt(int givenPosition){
        ImproveNode positionNode = firstNode;
        if (givenPosition<1 || givenPosition>length) {
            System.out.println("无效获取");
            return positionNode;
        }
        if ((isEmpty())) {
            return positionNode;
        }
        for (int i = 1; i < givenPosition; i++) {
            System.out.println("获取节点");
            System.out.println(positionNode.getData());
            positionNode = positionNode.getNextNode();
        }
        return positionNode;
    }

    public boolean add(Object newEntry) {
        ImproveNode newNode = new ImproveNode(newEntry);
        if ((isEmpty())) {
            firstNode = newNode;
        }else {
            tempLastNode.setNextNode(newNode);
        }
        tempLastNode = newNode;
        length++;
        return true;
    }

    public boolean add(int newPosition, Object newEntry) {
        boolean result = true;
        ImproveNode newNode = new ImproveNode(newEntry);
        if (newPosition<1 || newPosition>length) {
            System.out.println("插入失败");
            result = false;
            return result;
        }
        if (newPosition == 1) {
            firstNode = newNode;
            tempLastNode = newNode;
        }else if(newPosition == length){
            tempLastNode.setNextNode(newNode);
            tempLastNode = newNode;
        } else {
            ImproveNode beforeNode = getNodeAt(newPosition - 1);
            System.out.println("前一个节点：" + beforeNode.getData());
            ImproveNode lastNode = getNodeAt(newPosition);
            System.out.println("后一个节点：" + lastNode.getData());
            beforeNode.setNextNode(newNode);
            newNode.setNextNode(lastNode);
        }
        length++;
        return result;
    }

    public Object remove(int givePosition) {
        T result = null;
        if (givePosition<1 || givePosition > length) {
            System.out.println("非法移除");
            return result;
        }
        if (length == 1 && givePosition == 1) {
            result = (T)firstNode.getData();
            firstNode = null;
            tempLastNode = null;
            return result;
        }
        if (givePosition == 1) {
            result = (T)firstNode.getData();
            firstNode.setNextNode(firstNode.getNextNode());
        }else if(givePosition>1 && givePosition<length) {
            ImproveNode beforPosition = getNodeAt(givePosition-1);
            ImproveNode afterPosition = getNodeAt(givePosition+1);
            beforPosition.setNextNode(afterPosition);
            result = (T)getNodeAt(givePosition).getData();
        }else {
            tempLastNode = null;
            ImproveNode beforPosition = getNodeAt(givePosition-1);
            tempLastNode = beforPosition;
            result = (T)tempLastNode.getData();
        }
        length--;
        return result;
    }

    public void clean() {

    }

    public boolean replace(int givenPosition, Object newEntry) {
        boolean successfully = true;
        if (givenPosition<1 || givenPosition >length || isEmpty()) {
            successfully = false;
        }else{
            System.out.println("测试替换");
            getNodeAt(givenPosition).setData(newEntry);
        }
        return successfully;
    }

    public Object getEntry(int givenPosition) {
        T result = null;
        if (givenPosition<1 || givenPosition>length || isEmpty() ) {
            return result;
        }else if(givenPosition == length){
            result=(T)tempLastNode.getData();
        } else {
            result = (T)getNodeAt(givenPosition).getData();
        }
        return result;
    }

    public boolean contains(Object anEntry) {
        boolean contains = false;
        ImproveNode tempNode = firstNode;
        for (int i = 1; i < length ; i++) {
            tempNode = tempNode.getNextNode();
            if (tempNode.getData() == anEntry) {
                contains = true;
            }
        }
        return contains;
    }

    public int getSize() {
        return length;
    }

    public boolean isEmpty() {
        return length==0;
    }

    public boolean isFull() {
        return false;
    }

    public void display() {
        StringBuffer stringBuffer = new StringBuffer();
        ImproveNode node = firstNode;
        stringBuffer.append(node.getData()+ " ");
        for (int i = 1; i < length ; i++) {
            node = node.getNextNode();
            stringBuffer.append(node.getData()+" ");
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        ImproveLinkList<String> stringLinkList = new ImproveLinkList<String>();
        stringLinkList.add("a");
        stringLinkList.add("c");
        stringLinkList.add("x");
        stringLinkList.add("y");
        stringLinkList.add("z");
        System.out.println(stringLinkList.length);
        stringLinkList.display();
        stringLinkList.add(2,"b");
        stringLinkList.display();
        stringLinkList.add("ts");
        stringLinkList.display();
        System.out.println("移除操作1：");
        System.out.println(stringLinkList.remove(1));
        stringLinkList.display();
        System.out.println("移除操作2：");
        System.out.println(stringLinkList.remove(3));
        stringLinkList.display();
        System.out.println("移除操作3：");
        System.out.println(stringLinkList.remove(5));
        System.out.println("最后一个节点数据");
        System.out.println(stringLinkList.tempLastNode.getData());
        stringLinkList.display();
        System.out.println("替换数据：");
        System.out.println(stringLinkList.replace(4,"xxx"));
        stringLinkList.display();
        System.out.println(stringLinkList.getEntry(4));
        System.out.println(stringLinkList.contains("xxx"));
    }
}
