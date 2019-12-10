package OutClassWork.Interfaces;

import java.awt.*;

public class Truck extends Car {

    public Truck(Color color, FuelVars fuel, int vheels) {
        super(color, fuel, vheels);

    }

    @Override
    public void start() {
        System.out.println("Truck is started");
    }

    @Override
    public void ride() {
        System.out.println("Truck is ride");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped");
    }

}
