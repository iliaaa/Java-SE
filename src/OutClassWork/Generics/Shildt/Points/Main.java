package OutClassWork.Generics.Shildt.Points;

import static OutClassWork.Generics.Shildt.Points.Coords.*;

public class Main {
    public static void main(String[] args) {
        TwoD[] td = {new TwoD(1,2),
                        new TwoD(3,6),
                        new TwoD(0,-2),
                        new TwoD(-10,3)};

        FourD[] fd = {new FourD(3,2,10,0),
                        new FourD(63,0,24,-9),
                        new FourD(-13,-6,0,32),
                        new FourD(0,9,-12,-4)};

        Coords<TwoD> ctd = new Coords<>(td);

        Coords<FourD> cfd = new Coords<>(fd);
        showXY(ctd);
        showXYZ(cfd);
        showAll(cfd);
    }
}
