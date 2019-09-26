package com.javase.oop.classesmethods;

public class ReturnObj {
    public int a;

    public ReturnObj(int a) {
        this.a = a;
    }

    public ReturnObj incrByTen() {
        ReturnObj returnObj = new ReturnObj(a + 10);
        return returnObj;
    }
}
