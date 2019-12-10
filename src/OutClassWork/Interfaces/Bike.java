package OutClassWork.Interfaces;

import java.awt.*;

public class Bike extends AbstVehicle {

    public Bike(Color color, FuelVars fuel, int vheels) {
        super(color, fuel, vheels);
    }

    @Override
    public void start() {
        System.out.println("Bike is started");
    }

    @Override
    public void ride() {
        System.out.println("Bike is ride");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }

    @Override
    public void signal() {
        System.out.println("Beep like bike");
    }


}
