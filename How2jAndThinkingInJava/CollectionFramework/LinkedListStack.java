package CollectionFramework;

import InterfaceAndExtends.HeroBoss;

import java.util.LinkedList;

public class LinkedListStack implements Stack {

    LinkedList<HeroBoss> hero = new LinkedList<>();
    //把英雄推入到最后位置

    @Override
    public void push(HeroBoss h) {
        hero.addLast(h);
    }

    //把最后一个英雄取出来
    @Override
    public HeroBoss pull() {
        return hero.removeFirst();
    }

    //查看最后一个英雄
    @Override
    public HeroBoss peek() {
        return hero.peekLast();
    }

    public static void main(String[] args) {
        LinkedListStack stackhero = new LinkedListStack();
        for (int i = 0; i < 5; i++) {
            stackhero.push(new HeroBoss("英雄" + i));
        }
        System.out.println(stackhero.pull());
        System.out.println(stackhero.peek());


    }
}
