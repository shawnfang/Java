package CollectionFramework;

import InterfaceAndExtends.HeroBoss;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {
    public static void main(String[] args) {
        //LinkedList是一个双向链表结构的list
        //双向链表结构Deque
        LinkedList<HeroBoss> ll = new LinkedList<HeroBoss>();

        //所以可以很方便的在头部和尾部插入数据
        // 在最后插入新的英雄
        ll.addLast(new HeroBoss("hero1"));
        ll.addLast(new HeroBoss("hero2"));
        ll.addLast(new HeroBoss("hero3"));
        System.out.println(ll);
        // 在最前插入新英雄
        ll.addFirst(new HeroBoss("hero first"));
        System.out.println(ll);

        // 查看最前，或者最后
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        // 移除最前，或者最后
        System.out.println(ll.removeFirst());
        System.out.println(ll);
        System.out.println(ll.removeLast());
        System.out.println(ll);
        System.out.println("分割线");
        //所不同的是LinkedList还实现了Deque，进而又实现了Queue这个接口
        //Queue代表FIFO 先进先出的队列
        Queue<HeroBoss> q = new LinkedList<HeroBoss>();
        q.offer(new HeroBoss("hero q1"));
        q.offer(new HeroBoss("hero q2"));
        q.offer(new HeroBoss("hero q3"));
        System.out.println(q);
        System.out.print("把第一个元素取poll()出来:\t");
        //取出第一个Hero，FIFO 先进先出
        HeroBoss h = q.poll();
        System.out.println(h);
        System.out.println(q);

        // 查看第一个元素
        h = q.peek();
        System.out.println(h);
    }

}
