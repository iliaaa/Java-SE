package OutClassWork.Collections.Shildt;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> stAL = new ArrayList<>();

        stAL.add("C");
        stAL.add("A");
        stAL.add("B");
        stAL.add("D");
        stAL.add("E");
        stAL.add("F");
        stAL.add(1, "A2");
        System.out.println("size of al: " + stAL.size());
        System.out.println("stAL: " + stAL);

        stAL.remove("F");
        stAL.remove(2);

        System.out.println("size after deleting: " + stAL.size());
        System.out.println("stAL: " + stAL);

        String[] ia = new String[stAL.size()];
        ia = stAL.toArray(ia);

        for (String s : ia) {
            System.out.println(s);
        }
    }
}
