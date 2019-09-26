package com.javase.oop.constructors;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ClassesAndMethods {

    static class Point {       //creating new class with x and y fields
        int x, y;
        static String str = "Point";

        void shift(int dx, int dy) {
            x += dx;
            y += dy;
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

    static class Point2 {
        int x, y;
        static String str = "Point2";
    }

    public static void main(String[] args) {

        System.out.println("Before shifting:");
        String str = Point.str;
        Point p = new Point();
        String str1 = p.str;
        p.x = 4;
        p.y = 5;
        System.out.println(p.norm()+" for p");
        p.print();      //p printing

        Point p1 = new Point();
        p1.x = 1;
        p1.y = 1;
        System.out.println(p1.norm()+" for p1");
        p1.print();     // p1 printing

        System.out.println();
        System.out.println("After shifting:");

        p.shift(4, 3);      //p shifting
        System.out.println(p.norm()+" for p");
        p.print();

        p1.shift(1, 1);     //p1 shifting
        System.out.println(p1.norm()+" for p1");
        p1.print();

        System.out.println();
        System.out.println("Using override method shift after shifting: ");

        p.shift(5);
        System.out.println(p.norm()+" for p");
        p.print();

    }
}
