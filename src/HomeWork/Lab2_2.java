package HomeWork;

import java.util.Random;

public class Lab2_2 {
    Random random = new Random();
    int a = random.nextInt(99);
    int b = random.nextInt(99);
    int c = random.nextInt(99);

    public Lab2_2() {
        System.out.println(a + " " + b + " " + c);
    }

    boolean truthMeth(int a, int b, int c){
        if (a < b && b < c){
            return true;
        }  else { return false; }
    }

    public static void main(String[] args) {
        Lab2_2 lab2_2 = new Lab2_2();
        int a = lab2_2.a;
        int b = lab2_2.b;
        int c = lab2_2.c;

        System.out.println(lab2_2.truthMeth(a, b, c));
    }
}
