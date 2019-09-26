package com.javase.oop.interfaces;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is started");
    }

    @Override
    public void ride() {
        System.out.println("Truck is ride");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped");
    }
}
