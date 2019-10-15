package HomeWork.Lab5.Extensions;

public class Dog extends Animal {
    String name;

    public Dog(boolean isAnimal, boolean isExist, String name) {
        super(isAnimal, isExist);
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog(true,true, "Vasya");
        dog.makeSound();
    }
}
