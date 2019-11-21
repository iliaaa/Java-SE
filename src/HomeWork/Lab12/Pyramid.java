package HomeWork.Lab12;

public class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        //System.out.println("Pyramid vol");
        return 1 % 3 * s * h;
    }
}
