package HomeWork.Lab15.Interfaces;

public class Hydroplan implements Fly, Swim {
    @Override
    public void fly() {
        System.out.println("ima hydraplan ima fly");
    }

    @Override
    public void swim() {
        System.out.println("ima hydraplan ima also swim");
    }
}
