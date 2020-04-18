package Operators;

public class LiteralsCTPE {
    public static void main(String[] args) {
        // 二进制现实八进制和十六进制的方式
        int a = 011122345;
        int b = 0x345346;
        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
    }
}
