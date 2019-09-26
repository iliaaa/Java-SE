package com.javase.oop;

public class InnerClasses {
    public static void main(String[] args) {
        class outerClass {
            int x, y;

            class innerClass {
                void print() {
                    System.out.println("From inner class" + "\n" + "x: " + x + "\n" + "y: " + y);
                }
            }

            outerClass (int x, int y) {
                this.x = x;
                this.y = y;
            }

            innerClass getInner() {
                return new innerClass();
            }

            void print() {
                System.out.println("x: " + x + "\n" + "y: " + y);
            }
        }
        outerClass outer = new outerClass(1,4);
        outerClass.innerClass inner = outer.getInner();
        inner.print();
    }
}
