package com.javase.oop.interfaces;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is started");
    }

    @Override
    public void ride() {
        System.out.println("Bike is ride");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }
}
