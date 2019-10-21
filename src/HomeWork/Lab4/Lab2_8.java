package HomeWork.Lab4;

public class Lab2_8 {
    public static void main(String[] args) {
        long n = 2147483648L;
        boolean flag = false;
        int k = 0;
        do {
            k++;
            flag = true;
            n = n / 2;
        } while (n % 2 == 0);
        System.out.println(flag);
    }
}
