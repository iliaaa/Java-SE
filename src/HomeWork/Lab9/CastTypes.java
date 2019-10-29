package HomeWork.Lab9;

import javafx.scene.layout.BorderImage;

import java.util.Arrays;

public class CastTypes {
    public static void main(String[] args) {
        String s = "1234";
        Integer i = Integer.parseInt(s);
        Integer iref = new Integer(Integer.MIN_VALUE);
        String irefToS = String.valueOf(iref);
        Boolean bl = new Boolean(true);
        System.out.println(bl.getClass());
        Boolean bl1 = new Boolean(true);
        System.out.println(bl == bl1); //сравнивает ссылки
        System.out.println(bl.equals(bl1)); //сравнивает значения

        System.out.println("==============================");

        Integer n1 = new Integer(100);
        Integer n2 = new Integer(100);
        System.out.println(n1 == n2); //false т.к. ссылки на разные объекты
        n1 = 99;
        n2 = 99;
        System.out.println(n1 == n2); //true т.к. сравниваются числа

        System.out.println("==============================");

        int newi = 1000000000;
        System.out.println((float) newi); //выводит экспоненциальное число равное newi
        int otheri = 1234567890;
        System.out.println((float) otheri); //а тут выводит число 1.23456794E9 которое равно 1234567940, почему отличается от otheri?

        System.out.println("==============================");

        int[] arr = {10, 29, 12, 1, 3, 16, 123};
        Integer[] newArr = new Integer[arr.length];
        int[] newnewArr = new int[newArr.length];
        for (int j = 0; j < arr.length; j++) {
            newArr[j] = Integer.valueOf(arr[j]);
        }

        System.out.println(newArr.getClass());

        for (int j = 0; j < newArr.length; j++) {
            newnewArr[j] = (int) newArr[j];
        }

        System.out.println(newnewArr.getClass());

    }

}
