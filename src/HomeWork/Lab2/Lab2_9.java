package HomeWork.Lab2;

import java.util.Arrays;
import java.util.Random;

public class Lab2_9 {
    String[] a1;
    String[] a2;

    public Lab2_9() {
        this.a1 = a1;
        this.a2 = a2;
    }

    String[] createName (String[] a1, String[] a2) {
        int i = new Random().nextInt(a1.length);
        int j = new Random().nextInt(a2.length);
        String[] a3 = new String[] {a1[i], a2[j]};
        //System.out.println(Arrays.toString(a3));
        for (String k : a3) System.out.print(k + " ");
        return a3;
    }

    public static void main(String[] args) {
        Lab2_9 lab2_9 = new Lab2_9();
        String[] a1 = new String[] {"РАДИОАКТИВНЫЙ", "ГРЕЧНЕВЫЙ", "ДЕМОНИЧЕСКИЙ",  "ПРИЗРАЧНЫЙ",
                "ОЗОРНОЙ", "ПРИЗРАЧНЫЙ", "КОСМИЧЕСКИЙ", "ЗВЕЗДНЫЙ", "СЕКСУАЛЬНЫЙ", "НЕПОБЕДИМЫЙ" };
        String[] a2 = new String[] {"КАПИТАН", "ЭЛЬФ", "ПИНГВИН", "ИНДЕЕЦ", "ГНОМ", "УПЫРЬ", "БОРОДАЧ",
                "БОБЕР", "КОРОЛЬ", "ТОЛСТОПУЗ", "КИЛЛЕР"};

        lab2_9.createName(a1, a2);
    }
}
