package OutClassWork.Collections.ComparatotAndEqualsSample;

import java.util.HashSet;

public class SetsSample {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();

        integers.add(1);
        integers.add(1);
        integers.add(2);


        HashSet<Person> people = new HashSet<>();

        Person albert = new Person(12, "Albert");
        Person albert1 = new Person(13, "Albert");
        Person nick = new Person(123, "Nick");
        Person helga = new Person(545, "Helga");
        Person helga1 = new Person(545, "Helgaa");
        Person nick1 = new Person(126, "Nick");

        people.add(nick1);
        people.add(albert1);
        people.add(albert);
        people.add(nick);
        people.add(helga);
        people.add(helga1);
        people.add(nick1);


        System.out.println(people);
    }
}
