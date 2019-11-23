package HomeWork.Lab11.ComleteComp;

public class Motherboard {
    private String chipset;
    private final String manufactured;
    private int UsbQuantity;

    public Motherboard(String chipset, String manufactured, int usbQuantity) {
        this.chipset = chipset;
        this.manufactured = manufactured;
        UsbQuantity = usbQuantity;
    }

    public Motherboard setChipset(String chipset) {
        this.chipset = chipset;
        return this;
    }

    public Motherboard setUsbQuantity(int usbQuantity) {
        UsbQuantity = usbQuantity;
        return this;
    }

    public String getChipset() {
        return chipset;
    }

    public String getManufactured() {
        return manufactured;
    }

    public int getUsbQuantity() {
        return UsbQuantity;
    }

    @Override
    public String toString() {
        return  "\nchipset: " + chipset +
                ", \nmanufactured: " + manufactured +
                ", \nUsbQuantity: " + UsbQuantity;
    }
}
