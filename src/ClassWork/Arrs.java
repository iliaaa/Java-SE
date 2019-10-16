package ClassWork;

import java.util.Arrays;
import java.util.Random;

public class Arrs {
    Random random = new Random();
    int[] arr = new int[random.nextInt(15)];

    int[] capArr(){
        int count = 0;
        for(int i: arr){
            arr[i] = random.nextInt(99);
//            count++;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    void minValArr(int[] arr){
        int min = arr[0];
        for(int i: arr){
            if (i < min) min = i;
        }
        System.out.println("min: " + min);
    }

    public static void main(String[] args) {
        Arrs arrs = new Arrs();
        System.out.println(Arrays.toString(arrs.capArr()));
        //arrs.capArr();
//        arrs.minValArr(arr);
    }
}
