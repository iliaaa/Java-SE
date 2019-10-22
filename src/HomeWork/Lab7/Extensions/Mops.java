package HomeWork.Lab7.Extensions;

public class Mops extends Dog {

    public Mops(boolean isAnimal, String name) {
        super(isAnimal, name);
        System.out.println("Dog breed: Mops");
    }

    public static void main(String[] args) {
        Animal mops = new Mops(true, "Petya");
        mops.makeSound();
        mops.startLiving();
        mops.eat();
        mops.stopLiving();
    }
}
