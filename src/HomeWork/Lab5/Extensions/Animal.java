package HomeWork.Lab5.Extensions;

public class Animal extends Entity {

    public Animal(boolean isAnimal, boolean isExist) {
        super(isAnimal, isExist);
    }

    void makeSound(){
        System.out.println("it's sound");
    }
}
