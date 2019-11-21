package HomeWork.Lab12;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        //System.out.println("Ball vol");
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
}
