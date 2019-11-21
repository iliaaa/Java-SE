package HomeWork.Lab12;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(5);
        Cylinder cylinder = new Cylinder(3, 9);
        Pyramid pyramid = new Pyramid(34, 9);
        Box box = new Box(1000);
        System.out.println(box.add(ball) + " ball vol: " + ball.getVolume());
        System.out.println(box.add(cylinder) + " cylinder vol: " + cylinder.getVolume());
        System.out.println(box.add(pyramid) + " pyramid vol: " + pyramid.getVolume());
        System.out.println(box.getSizeAl());
        System.out.println(box.getSumOfAl());
    }
}
