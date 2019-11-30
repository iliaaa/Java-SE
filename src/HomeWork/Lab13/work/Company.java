package HomeWork.Lab13.work;

import HomeWork.Lab11.GroupOfHumans.Address;

public abstract class Company {
    private String name;
    private Address address;
    private String sphere;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getSphere() {
        return sphere;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSphere(String sphere) {
        this.sphere = sphere;
    }

    public abstract int averageSalary();

    public abstract int maxSalary();

    public abstract int minSalary();

}
