package OutClassWork.Interfaces;

import java.awt.*;

public class Car extends AbstVehicle {

    public Car(Color color, FuelVars fuel, int vheels) {
        super(color, fuel, vheels);
    }

    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void ride() {
        System.out.println("Car is ride");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

}
