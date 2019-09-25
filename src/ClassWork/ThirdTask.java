package ClassWork;

public class ThirdTask {
    public static void main(String[] args) {
        double Ek;
        double m = Math.random()*100;
        double v = Math.random()*20;
        System.out.println("m: " + m + "\nv: " + v);
        System.out.println("Ek = (m*(v*v))/2: " + (Ek = (m * Math.pow(v, 2)) / 2));
    }
}
