package HomeWork.Lab17;

import java.util.ArrayList;
import java.util.LinkedList;

public class EffectiveDeleting {
    public static void main(String[] args) {
        LinkedList<Integer> iLl = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            iLl.add(i);
        }

        Long start2 = System.currentTimeMillis();
        iLl.subList(iLl.size()/2 - 1, iLl.size()/2 + 2).clear();
        Long end2 = System.currentTimeMillis();

        System.out.println(end2 - start2);
    }
}
