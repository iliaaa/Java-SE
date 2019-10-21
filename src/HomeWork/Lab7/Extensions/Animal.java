package HomeWork.Lab7.Extensions;

public class Animal extends Entity {

    public Animal(boolean isAnimal) {
        super(isAnimal);
    }

    @Override
    public void eat() {
        System.out.println("I'm an animal and I'm eating c:");
    }

    void makeSound(){
        System.out.println("*it's sound*");
    }

    public static void main(String[] args) {
        Animal animal = new Animal(true);
        animal.startLiving();
        animal.makeSound();
        animal.eat();
        animal.stopLiving();
    }
}
