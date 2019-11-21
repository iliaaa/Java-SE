package ClassWork.Lecture11;

public class Point {
    private double x;
    private double y;
    private String privateField = "I am private";

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void clear() {
        x = 0;
        y = 0;
        System.out.println("Clear Point");
    }

    private void print() {
        System.out.println(privateField);
    }

    public void printPrivateField() {
        print();
    }
}
