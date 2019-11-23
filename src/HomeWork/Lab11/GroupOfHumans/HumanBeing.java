package HomeWork.Lab11.GroupOfHumans;

import java.util.Objects;

public class HumanBeing {
    private String name;                //В теории, все эти поля могут быть изменены, в том числе и дата рождения
    private String surname;             //к примеру, если дата в каком-нибудь документе была написано неверно
    private String patronymic;          //и если это можно доказать
    private final String birth;        //и если же поле даты сделать не файнал, то можно добавить пустой конструктор
    private Address address;            //и добавить сеттеры для всех полей, тогда можно будет создать человека без ничего и сеттить ему все
    private HumanBeing spouse;           //с помощью сеттеров, а так как дата рождения файнал - сеттер для даты сделать нельзя

    public HumanBeing(String name, String surname, String birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public HumanBeing(String name, String surname, String patronymic, String birth) {
        this(name, surname, birth);
        this.patronymic = patronymic;
    }

    public HumanBeing(String name, String surname, String patronymic, String birth, Address address) {
        this(name, surname, patronymic, birth);
        this.address = address;
    }

    public HumanBeing(String name, String surname, String birth, HumanBeing spouse) {
        this(name, surname, birth);
        this.spouse = spouse;
    }

    public HumanBeing(String name, String surname, String patronymic, String birth, HumanBeing spouse) {
        this(name, surname, patronymic, birth);
        this.spouse = spouse;
    }

    public HumanBeing(String name, String surname, String patronymic, String birth, Address address, HumanBeing spouse) {
        this(name, surname, patronymic, birth, address);
        this.spouse = spouse;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setSpouse(HumanBeing spouse) {
        this.spouse = spouse;
    }

    @Override
    public String toString() {
        return "Human:" +
                "\nname: " + name +
                ", surname: " + surname +
                ", patronymic: " + patronymic +
                ", \nbirth: " + birth +
                ", \naddress: " + address +
                ", \nspouse: " + spouse.name + " "  + spouse.surname;
    }

//    @Override
//    public String toString() {
//                if (address == null && patronymic == null && spouse == null) {
//                    return "\n" + name + " " + surname +
//                            ";\nDate of birth: " + birth + "\nSpouse: no.";
//                } else if (patronymic != null && spouse == null) {
//                    return "\n" + name + " " + surname + " " + patronymic +
//                            ";\nDate of birth: " + birth + ";\nAddress: " + address  + "\nSpouse: no.";
//                } else if (patronymic == null && spouse == null) {
//                    return "\n" + name + " " + surname + " " +
//                            ";\nDate of birth: " + birth + ";\nAddress: " + address  + "\nSpouse: no.";
//                } else if (address == null && patronymic == null) {
//                    return "\n" + name + " " + surname +
//                            ";\nDate of birth: " + birth + "\nSpouse: " + spouse.name + " " + spouse.surname + "\n";
//                } else if (patronymic != null) {
//                    return "\n" + name + " " + surname + " " + patronymic +
//                            ";\nDate of birth: " + birth + ";\nAddress: " + address + "\nSpouse: " + spouse.name + " " + spouse.surname + "\n";
//                } else {
//                    return "\n" + name + " " + surname + " " +
//                            ";\nDate of birth: " + birth + ";\nAddress: " + address  + "\nSpouse: " + "\n";
//        }
//    }
}
