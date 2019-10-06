package com.javase.oop.exercs;

import java.util.Random;

public class Reverce {
    Random random = new Random();
    int val = random.nextInt(9999999);

    int reverse(int val){
        StringBuilder sb = new StringBuilder(String.valueOf(val));
        sb = sb.reverse();
        String s = sb.toString();
        return val = Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Reverce reverce = new Reverce();
        int val = reverce.val;
        System.out.println("value: " + val);
        System.out.println("reversed value: " + reverce.reverse(val));
    }
}
