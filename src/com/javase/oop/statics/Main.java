package com.javase.oop.statics;

public class Main {
    public static void main(String[] args) {
        System.out.println(MyMath.Sum(2, 3));
        System.out.println(new MyMath().x);
        MyMath myMath = new MyMath();

        System.out.println(" Initial MyC - " + MyMath.myC);

        MyMath myMath1 = new MyMath();
        int myC = MyMath.myC;
        myMath1.myC =  myC + 10;
        System.out.println(" myMath1 processing MyC - " + myMath1.myC);

        MyMath myMath2 = new MyMath();

        int myC2 = myMath2.myC;
        myMath2.myC =  myC2 - 30;
        System.out.println(" myMath2 processing MyC - " + myMath1.myC);


        int sum = MyMath.Sum(2, 5);
    }
}
