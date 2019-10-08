package HomeWork.Lab2;

import java.util.Scanner;

public class Lab2_7 {
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

        Lab2_7 lab2_7 = new Lab2_7();
        System.out.println("number of numbers in number: " + lab2_7.numCount(lab2_7.n));
    }
}