package OutClassWork.Collections.Shildt;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("D");
        ll.add("C");
        ll.add("A");
        ll.add("E");
        ll.add("Z");
        ll.add(1, "A2");

        System.out.println("ll: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("ll after deleting: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deleting: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " setted");
        System.out.println("ll now: " + ll);
    }
}
