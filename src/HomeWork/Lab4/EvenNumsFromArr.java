package HomeWork.Lab4;

import java.util.Arrays;
import java.util.Random;

public class EvenNumsFromArr {
    int[][] arr;
    Random random = new Random();
    int i = random.nextInt(9);
    int j = random.nextInt(9);

    public EvenNumsFromArr() {
        while((i <= 1) || (j <= 3)){
            i = random.nextInt(9);
            j = random.nextInt(9);
        }
        this.arr = new int[i][j];
        System.out.println("arr[" + i + "][" + j + "]");
    }

    void fillArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(99);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void positiveSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr[i][j] >= 0) && (arr[i][j]%2 == 0)){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of all positive and even elements are: " + sum);
    }

    public static void main(String[] args) {
        EvenNumsFromArr evenNumsFromArr = new EvenNumsFromArr();
        int[][] arr = evenNumsFromArr.arr;
        evenNumsFromArr.fillArr(arr);
        int[][] newArr = {{4, 2, 1, 6, 7, -4}, {5, 3, -6, -3}, {12, -5, -45, 62, 2, -100}};
        System.out.println();
        evenNumsFromArr.printArr(newArr);
        evenNumsFromArr.positiveSum(newArr);
    }

}
