package HomeWork.Lab12;

import java.util.ArrayList;

public class Box extends Shape {
    private double vol;
    ArrayList<Shape> al = new ArrayList<>();

    public Box(double vol) {
        this.vol = vol;
    }

    @Override
    public double getVolume() {
        return vol;
    }

    public boolean add(Shape shape) {
        if (al.size() == 0 && shape.getVolume() <= vol) {
            al.add(shape);
            return true;
        } else if (getSumOfAl() < vol && ((vol - getSumOfAl()) >= shape.getVolume())) {
            al.add(shape);
            return true;
        }
        return false;
    }

    public int getSizeAl() {
        return al.size();
    }

    public double getSumOfAl() {
        double sum = 0;
        if (al.size() > 0) {
            for (Shape s: al) {
                sum += s.getVolume();
            }
            return sum;
        } else {
            return 0;
        }
    }
}
