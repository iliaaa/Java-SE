package HomeWork.Lab5.Extensions;

public class Mops extends Dog {
    public Mops(boolean isAnimal, String name) {
        super(isAnimal, name);
    }

    public static void main(String[] args) {
        Mops mops = new Mops(true, "Petya");
        mops.makeSound();
        mops.startLiving();
        mops.eat();
        mops.stopLiving();
    }
}
