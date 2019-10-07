package HomeWork;

import java.math.BigInteger;
import java.util.Random;

public class Lab2_3 {
    Random random = new Random();
    int val = random.nextInt(99);


//    int factorial(int val){
//        int i = 1;
//        int res = 1;
//        while (i < val){
//            res = res*(i+1);
//            i++;
//        }
//        return res;
//    }

    BigInteger factorial(int val){
        BigInteger i = BigInteger.ONE;
        BigInteger res = BigInteger.ONE;
        BigInteger value = BigInteger.valueOf(val);
        while (i.compareTo(value) == -1){
            res = res.multiply(i.add(BigInteger.ONE));
            i = i.add(BigInteger.ONE);
        }
        return res;
    }

    public static void main(String[] args) {
        Lab2_3 lab2_3 = new Lab2_3();
        int val = lab2_3.val;
        System.out.println(val);
        System.out.println(lab2_3.factorial(val));
    }
}
