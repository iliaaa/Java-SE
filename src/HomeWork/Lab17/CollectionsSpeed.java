package HomeWork.Lab17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsSpeed {
    public static void main(String[] args) {

        LinkedList<Integer> iLl = new LinkedList<>();
        ArrayList<Integer> iAl = new ArrayList<>();
        TreeSet<Integer> iTs = new TreeSet<>();
        HashSet<Integer> iHs = new HashSet<>();

        Long start = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            iLl.add(i);
        }
        Long end = System.currentTimeMillis();

        System.out.println("time of adding for LinkedList: " + (end - start));
        System.out.println("---------------------");

        Long start1 = System.currentTimeMillis();
        iLl.remove(5555599);
        Long end1 = System.currentTimeMillis();

        System.out.println("time of remove for LinkedList: " + (end1 - start1));
        System.out.println("---------------------");

        Long start2 = System.currentTimeMillis();
        iLl.contains(5555666);
        Long end2 = System.currentTimeMillis();

        System.out.println("time of search for LinkedList: " + (end2 - start2));
        System.out.println("======================");
        System.out.println();

        Long start3 = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            iAl.add(i);
        }
        Long end3 = System.currentTimeMillis();

        System.out.println("time of adding for ArrayList: " + (end3 - start3));
        System.out.println("---------------------");

        Long start4 = System.currentTimeMillis();
        iAl.remove(5555599);
        Long end4 = System.currentTimeMillis();

        System.out.println("time of remove for ArrayList: " + (end4 - start4));
        System.out.println("---------------------");

        Long start5 = System.currentTimeMillis();
        iAl.contains(5555666);
        Long end5 = System.currentTimeMillis();

        System.out.println("time of search for ArrayList: " + (end5 - start5));
        System.out.println("======================");
        System.out.println();

        Long start6 = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            iTs.add(i);
        }
        Long end6 = System.currentTimeMillis();

        System.out.println("time of adding for TreeSet: " + (end6 - start6));
        System.out.println("---------------------");

        Long start7 = System.currentTimeMillis();
        iTs.remove(5555599);
        Long end7 = System.currentTimeMillis();

        System.out.println("time of remove for TreeSet: " + (end7 - start7));
        System.out.println("---------------------");

        Long start8 = System.currentTimeMillis();
        iTs.contains(5555666);
        Long end8 = System.currentTimeMillis();

        System.out.println("time of search for TreeSet: " + (end8 - start8));
        System.out.println("======================");
        System.out.println();

        Long start9 = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            iHs.add(i);
        }
        Long end9 = System.currentTimeMillis();

        System.out.println("time of adding for HashSet: " + (end9 - start9));
        System.out.println("---------------------");

        Long start10 = System.currentTimeMillis();
        iHs.remove(5555599);
        Long end10 = System.currentTimeMillis();

        System.out.println("time of remove for HashSet: " + (end10 - start10));
        System.out.println("---------------------");

        Long start11 = System.currentTimeMillis();
        iHs.contains(5555666);
        Long end11 = System.currentTimeMillis();

        System.out.println("time of search for HashSet: " + (end11 - start11));
        System.out.println("======================");
    }
}
