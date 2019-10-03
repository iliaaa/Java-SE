package ClassWork;

import javax.smartcardio.CardTerminal;

public class Cat {
    String name;
    String sound;

    public Cat(String name, String sound) {
        this.name = name;
        this.sound = sound;
        System.out.println(name);
    }

    void say(){
        System.out.println(name + " says: " + sound);
    }

    public static void main(String[] args) {
        Cat gosha = new Cat("Gosha", "meow");
        gosha.say();

        Cat varya = new Cat("Varya", "MEOOOOOWWWWWWWWWWWWWW");
        varya.say();

        Cat vasya = new Cat("Vasya", "meh");
        vasya.say();
    }
}
