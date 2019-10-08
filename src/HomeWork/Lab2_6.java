package HomeWork;

import java.util.Random;

public class Lab2_6 {
    int n;
    int res = 1;

    public Lab2_6() {
        this.n = new Random().nextInt(10);
        System.out.println("Random number: " + n);
    }

    int average(int n) {
        int sumres = 0;
        if (n == 0){
            System.out.println(0);
            return 0;
        } else if (n == 1){
            System.out.println(res);
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(res + " ");
                sumres += res;
                res = res * 3;
            }
        }
        System.out.println("\nSum of numbers: " + sumres);
        return (sumres / n);
    }

    public static void main(String[] args) {
        Lab2_6 lab26 = new Lab2_6();
        System.out.println(lab26.average(lab26.n));
    }
}
