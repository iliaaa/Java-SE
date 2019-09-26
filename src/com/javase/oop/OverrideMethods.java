package com.javase.oop;

public class OverrideMethods {
    static void test(Object obj){
        System.out.println("Object");
    }

    static void test(String s){
        System.out.println("String");
    }

    public static void main(String[] args) {
        test(1);
        test("loh");

        Object loh = "loh";
        test(loh);

    }
}
