package com.javase.oop;

public class Costr {
    public static void main(String[] args) {
        class constr {
            int x, y;

            constr(int x, int y){
                this.x = x;
                this.y = y;
            }

            void print(){
                System.out.println("x: " + x + "\n" + "y: " + y);
            }
        }

        constr c = new constr(2,3);
        c.print();
    }
}

