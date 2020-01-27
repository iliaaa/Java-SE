package OutClassWork.Collections;

import java.util.*;

public class DraftCollection {
    public static void main(String[] args) {
        LinkedList<Object> objects = new LinkedList<>();
        Collection<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(1));
        System.out.println(hashSet.add(1));
        System.out.println(hashSet.add(2));
        System.out.println(hashSet);

        LinkedList<Integer> st1 = new LinkedList<>();
        st1.addAll(hashSet);
        st1.add(12);
        st1.addFirst(0);
        st1.add(3);
        st1.add(1);
        System.out.println(st1);
        Collections.sort(st1);
        System.out.println(st1);

        HashMap<Integer, String> intSt = new HashMap<>();
        intSt.put(1, "ras");
        intSt.put(2, "dva");
//        intSt.put(2, "dva");
//        intSt.put(2, "tri");
        intSt.put(3, "tri");
        intSt.put(4,"tri");
        System.out.println(intSt.size());
        System.out.println(intSt.values());
        System.out.println(intSt.containsValue("four"));
        Set<Map.Entry<Integer, String>> entries = intSt.entrySet();
        System.out.println(entries);
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey());
        }

        System.out.println(intSt);

    }
}
