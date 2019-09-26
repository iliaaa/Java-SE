package com.javase.oop.interfaces;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void ride() {
        System.out.println("Car is ride");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }
}
