package com.javase.oop.statics;

public class Point {
    int x, y;

    void shift(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    void shift(int dx){     //override method shift
        x += dx;
    }

    void print() {
        System.out.println("Point<"+x+","+y+">");
    }

    double norm() {
        return Math.sqrt(x * x + y * y);
    }
}
