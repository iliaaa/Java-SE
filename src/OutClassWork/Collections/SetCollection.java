package OutClassWork.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        String[] text = ("Sueta suet, - skazak Propoveduyshiy," + "- sueta suet: vse sueta.")
                .toLowerCase()
                .split("[,:\\-\\.]+");
        Set<String> uniques = new HashSet<>();
        Set<String> dups = new HashSet<>();
        for (String a: text)
            if (!uniques.add(a))
                dups.add(a);
        uniques.removeAll(dups);
        System.out.println(uniques);
        System.out.println(dups);
    }
}
