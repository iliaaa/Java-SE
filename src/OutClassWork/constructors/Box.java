package com.javase.oop.constructors;

public class Box {
    double x;
    double y;
    double z;

    public Box(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Box() {
        x = -1;
        y = -1;
        z = -1;
    }

    public Box(double len) {
        x = y = z = len;
    }

    public double volume() {
        return x*y*z;
    }

}
