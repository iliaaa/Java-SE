package ClassWork;

import java.util.Random;

public class RamVal {
    private static int v;
    Random random = new Random();
   // int v;

    public RamVal() {
        this.v = v;
    }

    int valSqr (int v) {
        return v*v;
    }

    void ifValEv(int v) {
        if (v % 2 == 0) {
            System.out.println("Value is even: " + v);
        } else {
            System.out.println("Value is odd: " + v);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        RamVal ramVal = new RamVal();
        ramVal.v = random.nextInt(99);
        ramVal.ifValEv(v);
    }
}
