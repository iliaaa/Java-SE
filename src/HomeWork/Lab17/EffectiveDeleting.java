package HomeWork.Lab17;

import java.util.ArrayList;

public class EffectiveDeleting {
    public static void main(String[] args) {
        ArrayList<Integer> iAl = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            iAl.add(i);
        }

        Long start2 = System.currentTimeMillis();
        iAl.subList(iAl.size()/2 - 1, iAl.size()/2 + 2).clear();
        Long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
    }
}
