package OutClassWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class TripletsCompareNew {
    int[][] arr;
    int sizei, sizej;

    public TripletsCompareNew(int i, int j) {
        this.sizei = i;
        this.sizej = j;
        this.arr = new int[i][j];
    }

    void fillArrs() {
        Random random = new Random();
        for(int i = 0; i < sizei; i++) {
            for (int j = 0; j < sizej; j++) {
                arr[i][j] = random.nextInt(99);
            }
//            arr1[i] = random.nextInt(99);
//            arr2[i] = random.nextInt(99);
        }
    }

    void printArrs(){
            System.out.println(Arrays.deepToString(arr));
        }
//        String arrString = Arrays.toString(arr);
//        System.out.println("Array: " + arrString);

    void trippletsCompare(int[][] arr) {
        int k1 = 0;
        int k2 = 0;
        int[] a = new int[2];
        if (sizei < sizej) {
            for (int i = 0; i < sizej - 1; i++) {
                for (int j = 0; j < sizej - 1; j++) {
                    if (arr[i][0] > arr[j][1]) {
                        a[0] = ++k1;
                    } else if (arr[i][0] < arr[j][1]) {
                        a[1] = ++k2;
                    } else {
                    }
                }
            }
            String aStr = Arrays.toString(a);
            System.out.println("Result of comparing: " + aStr);
        }
    }



    public static void main(String[] args) {
        TripletsCompareNew tripletsCompare = new TripletsCompareNew(2,3);
        int[][] arr = tripletsCompare.arr;
        tripletsCompare.fillArrs();
        tripletsCompare.printArrs();
        tripletsCompare.trippletsCompare(arr);

    }

}
