package OutClassWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class TripletsCompare {
    int[] arr1 ;
    int[] arr2 ;
    int size;

    public TripletsCompare(int i) {
        this.size = i;
        this.arr1 = new int[i];
        this.arr2 = new int[i];
    }

    void fillArrs() {
        Random random = new Random();
        for(int i = 0; i < size; i++) {
            arr1[i] = random.nextInt(99);
            arr2[i] = random.nextInt(99);
        }
    }

    void printArrs(){
        String arr1String = Arrays.toString(arr1);
        String arr2String = Arrays.toString(arr2);
        System.out.println("First array: " + arr1String + "\n" + "Second array: " + arr2String);
    }

    void trippletsCompare(int[] arr1, int[] arr2) {
        int k1 = 0;
        int k2 = 0;
        int[] a = new int[2];
        for(int i = 0; i < size; i++){
            if (arr1[i] > arr2[i]) {
                a[0] = ++k1;
            } else if (arr1[i] < arr2[i]) {
                a[1] = ++k2;
            } else {}
        }
    String aStr = Arrays.toString(a);
        System.out.println("Result of comparing: " + aStr);
    }



    public static void main(String[] args) {
        TripletsCompare tripletsCompare = new TripletsCompare(9);
        int[] arr1 = tripletsCompare.arr1;
        int[] arr2 = tripletsCompare.arr2;
        tripletsCompare.fillArrs();
        tripletsCompare.printArrs();
        tripletsCompare.trippletsCompare(arr1, arr2);

    }

}
