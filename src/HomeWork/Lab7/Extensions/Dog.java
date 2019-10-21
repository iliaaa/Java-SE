package HomeWork.Lab7.Extensions;

public class Dog extends Animal {
    String name;

    public Dog(boolean isAnimal, String name) {
        super(isAnimal);
        System.out.println("Name of dog: " + (this.name = name));
    }

    @Override
    public void eat() {
        System.out.println("I'm dog and I'm eating c:");
    }

    public static void main(String[] args) {
        Animal dog = new Dog(true, "Vasya");
        dog.makeSound();
        dog.startLiving();
        dog.eat();
        dog.stopLiving();
    }
}
