package OutClassWork.Exeptions;

public class MultipleCatches {
    String s = "qwe";
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println("a = " + a);
            int b = 42/a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("after try/catch");
    }
}
