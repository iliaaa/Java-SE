package ClassWork;

import java.util.Arrays;

public class WrapClasses {
    Character c = 'r';
    Integer i = new Integer(1);
    Double d = Double.valueOf("2.3");
    Long l = Long.parseLong("123");
    static Integer x = new Integer(2);
    static Integer y = new Integer(2);
    static Integer[] wrappedArr = new Integer[] {100, 1000, 10000};


    public static void main(String[] args) {
        WrapClasses wrapClasses = new WrapClasses();
        System.out.println(wrapClasses.l);
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        System.out.println(x.toString());
        Double d = Double.parseDouble(x.toString());
        System.out.println(Arrays.toString(wrappedArr));
        System.out.println(d.getClass());
    }
}
