package ClassWork;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Random;

public class Months {
    int m;

    public Months(int m) {
        this.m = m;
    }

    void currMonth(){
        switch (m){
            case 1:
                System.out.println("janaury");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september gorit");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println(m + ": this number of month doesn't exist");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int m = random.nextInt(20);
        Months months = new Months(m);
        months.currMonth();
    }
}
