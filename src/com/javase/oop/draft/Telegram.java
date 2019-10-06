package com.javase.oop.draft;

import java.util.Random;

public class Telegram implements Messangers{
    private static final String helloMessage = "Its Telegram";

    public Telegram() {
        System.out.println(helloMessage);
    }

    @Override
    public void init(String initMessage) {
        System.out.println(helloMessage + " :" + initMessage);
    }

    @Override
    public int cashInfo() {
//        Random random = new Random();
//        int cash = random.nextInt(150);
//        return cash;
        System.out.println("Telegram log");
        return new Random().nextInt(100);
    }
}
