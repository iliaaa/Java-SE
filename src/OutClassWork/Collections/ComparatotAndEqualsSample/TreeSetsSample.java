package OutClassWork.Collections.ComparatotAndEqualsSample;

import java.util.TreeSet;

public class TreeSetsSample {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();

        integers.add(120);
        integers.add(123);
        integers.add(1);
        integers.add(12);
        integers.add(16);


//        System.out.println(integers);

        TreeSet<Person> people = new TreeSet<>(new PersonComparator());

        Person albert = new Person(12, "Albert");
        Person albert1 = new Person(13, "Albert");
        Person nick = new Person(123, "Nick");
        Person helga = new Person(545, "Helga");
        Person helga1 = new Person(545, "Helgaa");
        Person nick1 = new Person(126, "Nick");

        people.add(nick1);
        System.out.println("===================");
        System.out.println(people);
        System.out.println("===================");
        people.add(albert1);
        System.out.println("===================");
        System.out.println(people);
        System.out.println("===================");
        people.add(albert);
        System.out.println("===================");
        System.out.println(people);
        System.out.println("===================");
        people.add(nick);
        System.out.println("===================");
        System.out.println(people);
        System.out.println("===================");
        people.add(helga);
        System.out.println("===================");
        System.out.println(people);
        System.out.println("===================");
        people.add(helga1);
        System.out.println("===================");
        System.out.println(people);
        System.out.println("===================");
        people.add(nick1);
        System.out.println("===================");
        System.out.println(people);
        System.out.println("===================");



    }
}
