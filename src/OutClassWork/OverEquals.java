package OutClassWork;

import java.util.Objects;

public class OverEquals {
    private final double re;
    private final double im;

    public OverEquals(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OverEquals)){
            return false;
        }
        return ((Double.compare(re, ((OverEquals) o).re)) == 0) && ((Double.compare(im, ((OverEquals) o).im)) == 0);
    }
    @Override
    public int hashCode() {
//        return Objects.hash(getRe(), getIm());
        final double prime = 31;
        double result = 1;
        result = prime * result + re;
        result = prime * result + im;
        return (int) result;
    }

    public static void main(String[] args) {
        OverEquals overEquals = new OverEquals(0.123, 1.345);
        OverEquals overEquals1 = new OverEquals(0.123, 1.345);
        OverEquals overEquals2 = new OverEquals(0.2342,3.1231);
        System.out.println(overEquals.equals(overEquals1));
        System.out.println(overEquals1.equals(overEquals));
        System.out.println(overEquals.hashCode());
        System.out.println(overEquals1.hashCode());
        System.out.println(overEquals2.hashCode());
    }
}
