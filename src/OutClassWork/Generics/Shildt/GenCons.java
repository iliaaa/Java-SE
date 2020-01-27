package OutClassWork.Generics.Shildt;

public class GenCons {
    private double val;

    <T extends Number> GenCons(T val) {
        this.val = val.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        GenCons genCons = new GenCons(100);
        GenCons genCons1 = new GenCons(123.3F);

        genCons.showVal();
        genCons1.showVal();
    }

}
