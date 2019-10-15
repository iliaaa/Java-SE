package HomeWork.Lab5.Extensions;

public class Mops extends Dog {
    public Mops(boolean isAnimal, boolean isExist, String name) {
        super(isAnimal, isExist, name);
    }

    public static void main(String[] args) {
        Mops mops = new Mops(true, true,"Vasya");
    }
}
