package com.javase.oop.exercs;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    public Palindrom() {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.print("Add your string: ");
        boolean res;
        Palindrom palindrom = new Palindrom();

        StringBuilder sb = new StringBuilder();
        sb.append(palindrom.name.replaceAll("\\W", "").toLowerCase(Locale.ENGLISH));
        String newNamesb  = sb.toString();
        System.out.println(newNamesb);

        StringBuilder sbb = new StringBuilder(sb);
        sbb.reverse();
        String newNamesbb = sbb.toString();
        System.out.println(newNamesbb);

        if (newNamesb.equals(newNamesbb)) {
            res = true;
        } else { res = false; }

        System.out.println(newNamesb.equals(newNamesbb));
    }
}
