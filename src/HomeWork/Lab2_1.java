package HomeWork;

import ClassWork.RamVal;

import java.util.Random;

public class Lab2_1 {
    int i;

    public Lab2_1() {
        this.i = new Random().nextInt(12);
        System.out.println(i);
    }

    void seasons(int i) {
        if (i == 12 || i == 1 || i == 2) {
            System.out.println("Winter");
        } else if (i == 3 || i == 4 || i == 5) {
            System.out.println("Spring");
        } else if (i == 6 || i == 7 || i == 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Fall");
        }
    }

    public static void main(String[] args) {
        Lab2_1 lab2_1 = new Lab2_1();
        int i = lab2_1.i;
        lab2_1.seasons(i);
    }
}
