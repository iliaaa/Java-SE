package OutClassWork.Interfaces;

import java.awt.*;

public abstract class AbstVehicle implements Vehicle {
    public Color color;
    private final FuelVars fuel;
    public final int vheels;

    public AbstVehicle(Color color, FuelVars fuel, int vheels) {
        this.color = color;
        this.fuel = fuel;
        this.vheels = vheels;
    }

    enum FuelVars {
        DIESEL,
        PETROL,
        ELECTRIC;
    }

    public final Color getColor() {
        return color;
    }

    public final FuelVars getFuel() {
        return fuel;
    }

    public String toString(){
        return "Color of " + getClass().getSimpleName() + ": " + color +
                "\nFuel: " + getFuel() +
                "\nCount of wheels: " + vheels;
    }
}
