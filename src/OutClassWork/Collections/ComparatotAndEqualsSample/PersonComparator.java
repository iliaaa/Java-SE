package OutClassWork.Collections.ComparatotAndEqualsSample;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        System.out.println("compareTo run: Name - " + o1.name + " id - " + o1.id);
        System.out.println("compareTo run: Name - " + o2.name + " id - " + o2.id);
        int compare = Integer.compare(o1.id, o2.id);
        if (compare == 0 ){
            System.out.println("NAME compareTo run: Name - " + o1.name + " id - " + o1.id);
            System.out.println("NAME compareTo run: Name - " + o2.name + " id - " + o2.id);
            compare = o1.name.compareTo(o2.name);
        }
        System.out.println(" compare - " + compare);
        return compare;
    }
}
