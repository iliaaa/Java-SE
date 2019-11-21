package ClassWork.Lecture11;

import java.awt.*;

public class Pixel extends Point {
    private Color color;

    public Pixel(double x, double y, Color color) {
        super(x, y);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void clear(){
        super.clear();
        color = null;
        System.out.println("Clear Pixel");
    }

}
