package com.javase.oop.draft;

import java.util.Random;

public class WatsApp implements Messangers {
    private static final String helloMessage = "Its WatsApp";

    public WatsApp() {
        System.out.println(helloMessage);
    }

    @Override
    public void init(String initMessage) {
        System.out.println(helloMessage + " :" + initMessage);
    }

    @Override
    public int cashInfo() {
        System.out.println("WatsApp log");
        return new Random().nextInt(100);
    }
}
