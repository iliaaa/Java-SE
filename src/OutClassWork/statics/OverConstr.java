package com.javase.oop.statics;
import com.javase.oop.constructors.Box;

public class OverConstr {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 15);
        Box box1 = new Box(15);
        Box box2 = new Box();

        double vol;

        System.out.println(vol = box.volume());
        System.out.println(vol = box1.volume());
        System.out.println(vol = box2.volume());
    }
}
