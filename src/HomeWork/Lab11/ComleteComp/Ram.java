package HomeWork.Lab11.ComleteComp;

public class Ram {
    private int volume;
    private final String manufacturer;

    public Ram(int volume, String manufacturer) {
        this.volume = volume;
        this.manufacturer = manufacturer;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return  "\nvolume: " + volume +
                ", \nmanufacturer: " + manufacturer;
    }
}
