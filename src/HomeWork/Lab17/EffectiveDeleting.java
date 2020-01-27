package HomeWork.Lab17;

import java.util.ArrayList;

public class EffectiveDeleting {
    public static void main(String[] args) {
        ArrayList<Integer> iAl = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            iAl.add(i);
        }

        Long start1 = System.currentTimeMillis();
        iAl.remove(iAl.size()/2);
        Long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}
