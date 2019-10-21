package HomeWork.Lab7.Extensions;

public class Animal extends Entity {

    public Animal(boolean isAnimal) {
        super(isAnimal);
    }


    void makeSound(){
        System.out.println("*it's sound*");
    }

    public static void main(String[] args) {
        Animal animal = new Animal(true);
        animal.makeSound();
    }
}
