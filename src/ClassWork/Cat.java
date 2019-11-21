package ClassWork;

import javax.smartcardio.CardTerminal;

public class Cat extends Pet{
    String name;
    String sound;
    double age;
    Cat(String name, double age) {
        super(name);
        this.age = age;
    }
    public Cat(String name, double age, String sound) {
        this(name, age);
        this.sound = sound;
        System.out.println(name);
    }

    void say(){
        System.out.println(name + " says: " + sound);
    }

    public static void main(String[] args) {
        Cat gosha = new Cat("Gosha", 1);
        gosha.say();

        Cat varya = new Cat("Varya", 20,"MEOOOOOWWWWWWWWWWWWWW");
        varya.say();

        Cat vasya = new Cat("Vasya", 45,"meh");
        vasya.say();
    }
}
