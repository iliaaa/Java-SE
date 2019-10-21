package HomeWork.Lab4;

import java.util.Random;

public class Lab2_5 {
    Random random = new Random();
    int val = random.nextInt(9999999);

    int reverse(int val){
        StringBuilder sb = new StringBuilder(String.valueOf(val));
        sb = sb.reverse();
        String s = sb.toString();
        return val = Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Lab2_5 lab2_5 = new Lab2_5();
        int val = lab2_5.val;
        System.out.println("value: " + val);
        System.out.println("reversed value: " + lab2_5.reverse(val));
    }
}
