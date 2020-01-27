package OutClassWork.Collections.ComparatotAndEqualsSample;

import java.util.Comparator;
import java.util.Objects;

//public class Person implements Comparable<Person>
public class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS: Name - " + this.name + " id - " + this.id);
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(getId(), getName());
        System.out.println("run with: Name - " + this.name + " id - " + this.id + " hash - " + hash);
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Person o) {
//        System.out.println("compareTo run: Name - " + this.name + " id - " + this.id);
//        System.out.println("compareTo run: Name - " + o.name + " id - " + o.id);
//        int compare = Integer.compare(this.id, o.id);
//        System.out.println("compareTo run: Name - " + this.name + " id - " + this.id + " compare - " + compare);
//        return compare;
//    }
}
