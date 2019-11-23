package HomeWork.Lab11.ComleteComp;

public class Cpu {
    private String frequency;
    private final String manufacturer;

    public Cpu(String frequency, String manufacturer) {
        this.frequency = frequency;
        this.manufacturer = manufacturer;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return  "\nfrequency: " + frequency +
                ", \nmanufacturer: " + manufacturer;
    }
}
