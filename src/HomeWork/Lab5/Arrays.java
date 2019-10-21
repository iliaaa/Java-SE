package HomeWork.Lab5;

public class Arrays {
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
//        int[] a1 = {10, 5, 6};
//        int[] a3 = {4, 5, 6, 9};
//        int[] a2 = {5, 6};
        arrays.run();
    }

    private void run(int[]... arr) {
        int res= 0;
        for (int i = 0; i <= (arr.length - 1); i++) {
            int sum = 0;
            for (int j = 0; j <= (arr[i].length - 1); j++) {
                sum += arr[i][j];
                System.out.println("sum: " + sum);
            }
            System.out.println(res += sum);
        }
    }
}
