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
}