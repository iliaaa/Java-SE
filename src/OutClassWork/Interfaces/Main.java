package OutClassWork.Interfaces;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Quadricycle quadricycle = new Quadricycle(Color.RED, AbstVehicle.FuelVars.PETROL, 4);
        System.out.println(quadricycle.vheels);
        quadricycle.signal();

        Car truck = new Truck(Color.RED, AbstVehicle.FuelVars.DIESEL, 8);
        System.out.println(truck);

        System.out.println();
        Car eCar = new Car(Color.GRAY, AbstVehicle.FuelVars.ELECTRIC, 4);
        eCar.signal();
        eCar.start();
        System.out.println(eCar);
    }
}
