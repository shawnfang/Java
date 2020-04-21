package Operators;
class Letter{
    float m;
}

class Letter2{
    int s;
}

public class OperatorsPthree {
    static void f(Letter y){
        y.m = 10086.10f;
    }

    static void f2(Letter2 x){
        x.s = 100;
    }

    public static void main(String[] args) {
        Letter L1 = new Letter();
        L1.m = 10010l;
        System.out.println(L1.m);
        f(L1);
        System.out.println(L1.m);
        L1.m = 100102l;
        System.out.println(L1.m);

        Letter2 L2 = new Letter2();
        Letter2 L3 = new Letter2();
        System.out.println(L2.s);
        f2(L2);
        System.out.println(L2.s);
        L2.s = 10000;
        L3.s = 10111;
        L2.s = L3.s;
        f2(L3);
        System.out.println(L2.s);
        System.out.println(L3.s);
        System.out.println(L3);



    }
}
