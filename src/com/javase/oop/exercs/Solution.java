package com.javase.oop.exercs;

import java.util.Scanner;

public class Solution {
    String S;

    public Solution(String S) {
        this.S = S;
    }

    void solution(String S) {
        char[] arr = S.toCharArray();
        for (int i = 0; i <= (arr.length - 1); i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i]);
            }
        }
        System.out.print(" ");
        for (int i = 0; i <= (arr.length - 1); i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        System.out.println(T);
        int i = 0;

        while (i < T) {
            if (T >= 1 && T <= 100){
                String s = sc.next();
                Solution sol = new Solution(s);
                sol.solution(s);
            } else { break; }
            i++;
        }
        sc.close();
    }
}
