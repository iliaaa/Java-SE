package HomeWork.Lab7.Extensions;
import static java.util.Collections.sort;
public class Plant extends Entity {
    public Plant(boolean isAnimal, String s) {
        super(isAnimal);
    }

    int more(boolean b, boolean... b2){
        System.out.println(b2.length);
        return b2.length;
    }

    public static void main(String[] args) {
    }
}
