package OutClassWork;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Factorial {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(9);
        System.out.println(value);
        BigInteger factorial = BigInteger.valueOf(1);
        BigInteger val = BigInteger.valueOf(value);
        BigInteger prev = BigInteger.ONE;
        BigInteger curr = BigInteger.valueOf(2);
        BigInteger next = BigInteger.valueOf(0);

        if (value == 1) {
            System.out.println(factorial);
        }
        else {
            for (BigInteger i = BigInteger.ONE ; i.compareTo(val) < 0; i = i.add(BigInteger.ONE)) {
                next = prev.multiply(i);
                factorial = next;
                prev = curr;
                curr = next;
                System.out.println(factorial);
                //System.out.println(factorial);
            }
        }
        System.out.println(factorial);
    }
}
