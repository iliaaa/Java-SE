package HomeWork.Lab12;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        //System.out.println("Cylinder vol");
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }
}
