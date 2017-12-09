package com.a;

public class A {
    private int a;
    private int b;
    public static void main(String[] args) {
        A a = new A();
        a.test(4,33);
        System.out.println("git");
    }
    public static void test(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    private static void testTow(String age){
        int a = 1;
        int b = 3;
        int c = a * b;
        System.out.println(c)
        System.out.println(age);
    }
}
