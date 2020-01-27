package OutClassWork.Generics.Shildt.TwoGen;

public class Main {
    public static void main(String[] args) {

        TwoGen<Integer, String> tgOb = new TwoGen<>(88, "blabla");

        tgOb.showTypes();

        int v = tgOb.getOb1();
        System.out.println("v: " + v);
        String str = tgOb.getOb2();
        System.out.println("str: " + str);
    }
}
