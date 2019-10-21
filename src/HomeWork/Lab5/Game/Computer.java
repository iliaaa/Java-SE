package HomeWork.Lab5.Game;

import java.util.Random;

public class Computer {
    Random random = new Random();
    int val;

    public Computer() {
        this.val = new Random().nextInt(5);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        int val = computer.val;
    }
}
