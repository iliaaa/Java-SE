package OutClassWork.Generics.Shildt.Stats;

public class Main {
    public static void main(String[] args) {
        Integer[] inums = {1,2,3,4,5};
        Stats<Integer> integerStats = new Stats<>(inums);
        double v = integerStats.average();
        System.out.println("average integer: " + v);

        Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
        Stats<Double> doubleStats = new Stats<>(dnums);
        double w = doubleStats.average();
        System.out.println("average double: " + w);

        if (integerStats.sameAvg(doubleStats)){
            System.out.println("same");
        } else {
            System.out.println("same'nt");
        }

        Float[] fmuns = {1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats<Float> floatStats = new Stats<>(fmuns);
        double x = floatStats.average();
        System.out.println("average of float: " + x);

        if (integerStats.sameAvg(floatStats)) {
            System.out.println("same");
        } else {
            System.out.println("same'nt");
        }
    }
}
