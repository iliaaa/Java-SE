package HomeWork;
import java.util.*;

public class Lab1 {

    static int sqr(int o) {
        return o*o;
    }

    static float cub(float o){
        return o*o*o;
    }

    static float sqr(float o){
        return o*o;
    }
    public static void main(String[] args) {
        int simpMult;
        float simpMult1;
        Random random = new Random();
        int a = random.nextInt(10);     //применить сокращеенное умножение также можно и с типом char, но используя приведение типов,
        int b = random.nextInt(10);     // не забывая о MIN.Value (0) и MAX.Value (65535)
                                               // в консоли мы получим символ, порядковый номер которого получился после вычислений

        float x = random.nextFloat()*50;
        float y = random.nextFloat()*50;

        System.out.println("random a: " + a + "\nrandom b: " + b);
        System.out.println("random x: " + x + "\nrandom y : " + y);

        System.out.println("Simple multiplication (a + b)^2 : " + (simpMult = sqr(a) + 2 * a * b + sqr(b)) +
                           "\nSimple multiplication (a - b)^2 : " + (simpMult = sqr(a) - 2 * a * b + sqr(b)) +
                           "\nSimple multiplication a^2 - b^2 : " + (simpMult = (a - b)*(a + b)) +
                           "\nSimple multiplication (x + y)^3 : " + (simpMult1 = cub(x) + 3*sqr(x)*y + 3*x*sqr(y) + cub(y)) +
                           "\nSimple multiplication (x - y)^3 : " + (simpMult1 = cub(x) - 3*sqr(x)*y + 3*x*sqr(y) - cub(y)) +
                           "\nSimple multiplication x^3 - y^3 : " + (simpMult1 = (x - y)*(sqr(x) + x*y + sqr(y))) +
                           "\nSimple multiplication x^3 + y^3 : " + (simpMult1 = (x + y)*(sqr(x) - x*y + sqr(y))));

        System.out.println("\n\tLorem ipsum!\n" +                        //я просто скопипастил с презентации с отступам и они сами проставились тут
                "Dolor sit amet, consectetur adipiscing elit. \n" +      //и они сами проставились тут
                "Maecenas quis sollicitudin augue.\n" +                  //так можно было?
                "\t\tNullam blandit!\n");

    }
}
