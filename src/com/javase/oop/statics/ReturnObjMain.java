package com.javase.oop.statics;
import com.javase.oop.classesmethods.ReturnObj;

public class ReturnObjMain {
    public static void main(String[] args) {
        ReturnObj returnObj = new ReturnObj(10);
        ReturnObj returnObj1;

        returnObj1 = returnObj.incrByTen().incrByTen();
        System.out.println(returnObj.a);
        System.out.println(returnObj1.a);


    }
}
