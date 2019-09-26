package com.javase.oop.statics;
import com.javase.oop.classesmethods.ObMeth;

public class ObMethMain {
    public static void main(String[] args) {
        ObMeth obMeth = new ObMeth(10, 20);
        obMeth.meth(obMeth);                                //меняет значение переменных в экземпляре объекта
        System.out.println(obMeth.x + " " + obMeth.y);
    }
}
