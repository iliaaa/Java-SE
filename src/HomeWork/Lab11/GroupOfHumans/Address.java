package HomeWork.Lab11.GroupOfHumans;

public class Address {
    private String country;
    private String city;
    private String street;
    private String house;
    private int flat;
    private int index;

    public Address(String country, String city, String street, String house, int flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public Address(String country, String city, String street, String house, int flat, int index) {
        this(country, city, street, house, flat);
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public int getFlat() {
        return flat;
    }

    public int getIndex() {
        return index;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public Address setHouse(String house) {
        this.house = house;
        return this;
    }

    public Address setFlat(int flat) {
        this.flat = flat;
        return this;
    }

    public Address setIndex(int index) {
        this.index = index;
        return this;
    }

    @Override
    public String toString() {
        return "Address: " +
                "country: " + country +
                ", city: " + city +
                ", street: " + street +
                ", house: " + house +
                ", flat: "  + flat +
                ", index: " + index +
                '.';
    }
}
