package com.javase.oop.exercs;

import java.math.BigInteger;
import java.util.Random;

public class Factorial {
    int val;

    public Factorial(int val) {
        this.val = val;
    }

    //    int factorial(int val){
//        int i = 1;
//        int res = 1;
//        while (i < val){
//            res = res*(i+1);
//            i++;
//        }
//        return res;
//    }

    BigInteger factorial(int val){
        BigInteger i = BigInteger.ONE;
        BigInteger res = BigInteger.ONE;
        BigInteger value = BigInteger.valueOf(val);
        while (i.compareTo(value) == -1){
            res = res.multiply(i.add(BigInteger.ONE));
            i = i.add(BigInteger.ONE);
        }
        return res;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial(new Random().nextInt(100));
        int val = factorial.val;
        System.out.println(val);
        System.out.println(factorial.factorial(val));
    }
}
