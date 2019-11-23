package HomeWork.Lab11.GroupOfHumans;

import HomeWork.Lab11.Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(0.1, 2);
        Address address1 = new Address("Russia", "StP", "Raevskogo", "22", 4);
        Address address2 = new Address("Russia", "StP", "Raevskogo", "21", 16, 123456);
        Address address3 = new Address("Earth", "Gde-to", "Pushkina", "Kolotushkina", 0);

        System.out.println(address1.setIndex(00000).setCity("Wonderland").setFlat(420).setHouse("House of rising sun"));

        HumanBeing humanBeing = new HumanBeing("Ilya", "Kirpichny", "Vitalievich", "22.01.1996");
        HumanBeing humanBeing1 = new HumanBeing("Maksim", "Andreev", "11.11.1111");
        HumanBeing humanBeing2 = new HumanBeing("Andrey", "Maksimov", "01.01.0101");
        HumanBeing humanBeing3 = new HumanBeing("blabla", "blablala", "23.12.1234");
        HumanBeing wife = new HumanBeing("Baba", "Yaga", "Vasilievna", "01.01.1900");
        HumanBeing husband = new HumanBeing("Koschey", "Bessmertniy", "Ivanovich", "02.01.1800");
        wife.setSpouse(husband);
        husband.setSpouse(wife);
        System.out.println(husband);

        humanBeing.setAddress(address1);
        System.out.println(humanBeing.getAddress());

        GroupOfStudents groupOfStudents = new GroupOfStudents(0001, 3);

        try {
            groupOfStudents.addStuds(humanBeing);
            groupOfStudents.addStuds(humanBeing1);
            groupOfStudents.addStuds(humanBeing2);
            groupOfStudents.addStuds(humanBeing3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(Arrays.toString(groupOfStudents.getArrOfStuds()));
        }



    }
}
