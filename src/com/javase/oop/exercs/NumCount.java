package com.javase.oop.exercs;

import java.util.Scanner;

public class NumCount {
    Scanner scanner = new Scanner(System.in);
    long n;

    int numCount(long n) {
        System.out.print("add your number: ");
        while (!scanner.hasNextLong()){
            System.out.println("that is not a number...");
            scanner.next();
        }
        n = scanner.nextLong();
        System.out.println("number: " + n);

        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        int numCount = arr.length;
        return numCount;
    }

    public static void main(String[] args) {

        NumCount numCount = new NumCount();
        System.out.println("number of numbers in number: " + numCount.numCount(numCount.n));
    }
}