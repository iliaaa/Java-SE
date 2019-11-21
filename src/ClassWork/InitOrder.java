package ClassWork;

import java.util.Arrays;

public class InitOrder {
    final String name;

    static int[] arr = {1,2,3};
    static double statField;

    InitOrder(String name) {
        this.name = name;
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Simple block");
    }

    public static void main(String[] args) {

        System.out.println("Main");
       // InitOrder initOrder = new InitOrder();
        System.out.println(statField);
        System.out.println(Arrays.toString(arr));
    }
}
