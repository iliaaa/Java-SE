package com.javase.oop.draft;

import java.util.Random;

public class Wiber implements Messangers{
    private static final String helloMessage = "Its Wiber";

    public Wiber() {
        System.out.println(helloMessage);
    }

    @Override
    public void init(String initMessage) {
        System.out.println(helloMessage + " :" + initMessage);
    }

    @Override
    public int cashInfo() {
        System.out.println("Wiber log");
        return new Random().nextInt(100);
    }
}
