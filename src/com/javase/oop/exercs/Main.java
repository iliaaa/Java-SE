package com.javase.oop.exercs;

import java.util.Scanner;

public class Main {
    static void hanoi(int n, int from, int to, int additional)

    {

        if (n == 0) return;

        hanoi(n-1,from,additional,to);

        System.out.println(from + " " + to);

        hanoi(n-1,additional,to,from);

    }



    public static void main(String[] args)

    {
        Scanner con = new Scanner(System.in);

        int n = con.nextInt();

        hanoi(n,1,2,3);


    }
}
