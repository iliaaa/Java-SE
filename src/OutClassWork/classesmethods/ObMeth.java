package com.javase.oop.classesmethods;

public class ObMeth {
    public int x;
    public int y;

    public ObMeth(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void meth (ObMeth o) {
        o.x *= 2;
        o.y /= 2;
    }
}
