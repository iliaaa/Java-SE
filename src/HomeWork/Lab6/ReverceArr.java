package HomeWork.Lab6;

import java.util.Arrays;
import java.util.Random;

public class ReverceArr {
    Random random = new Random();
    int[] arr;

    public ReverceArr() {
        this.arr = new int[random.nextInt(19)];
    }

    int[] fillArr(int[] arr){
        for (int i = 0; i < (arr.length - 1); i++) {
            arr[i] = random.nextInt(99);
        }
        return arr;
    }

    void reverceArr(int[] arr){
        int[] revArr = new int[arr.length];
        int j = 0;
        for (int i = (arr.length - 1); i >= 0; i--, j++) {
            revArr[j] = arr[i];
        }
        System.out.println("First arr: " + Arrays.toString(arr));
        System.out.println("Reverced arr: " + Arrays.toString(revArr));
    }

    public static void main(String[] args) {
        ReverceArr reverceArr = new ReverceArr();
        int[] arr = reverceArr.arr;
        reverceArr.fillArr(arr);
        reverceArr.reverceArr(arr);
    }
}
