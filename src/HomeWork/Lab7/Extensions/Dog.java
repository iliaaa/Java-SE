package HomeWork.Lab7.Extensions;

public class Dog extends Animal {
    String name;

    public Dog(boolean isAnimal, String name) {
        super(isAnimal);
        System.out.println("Name of dog is: " + (this.name = name));
    }

    public static void main(String[] args) {
        Dog dog = new Dog(true, "Vasya");
        dog.makeSound();
        dog.startLiving();
        dog.eat();
        dog.stopLiving();
    }
}
