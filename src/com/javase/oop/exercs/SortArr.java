package com.javase.oop.exercs;

import java.util.Arrays;

public class SortArr {

//    void sortArr (int[] a1, int[] a2) {
//        System.arraycopy();
//    }
    public static void main(String[] args) {


    int[] a1 = {3, 2, 1, 7};
    int[] a2 = {5, 2, 0};

    int[] a3 = new int[a1.length+a2.length];
        System.out.println(Arrays.toString(Arrays.copyOfRange(a1, 1,a1.length)));
        System.arraycopy(a1, 0, a3, 0, a1.length);
    System.arraycopy(a2, 0, a3, a1.length, a2.length);
    Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));
    }
}