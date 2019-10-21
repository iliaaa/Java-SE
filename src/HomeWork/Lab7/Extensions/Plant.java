package HomeWork.Lab7.Extensions;
import static java.util.Collections.sort;
public class Plant extends Entity {
    public Plant(boolean isAnimal, String s) {
        super(isAnimal);
    }

    @Override
    public void eat() {
        System.out.println("I'm a plant and I'm eating c:");
    }

    public static void main(String[] args) {
    }
}
