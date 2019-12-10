package HomeWork.Lab15;

import java.util.Arrays;

public class BasicCat {
    // Мы могли бы захардкодить значения. Но как быть с экземплярами классов?
    /*
    String nameStr = "Barsik";
    double ageYears = 1.8;
    double weightKg = 4.6;
    */

    private String nameStr;
    private double ageYears;
    private double weightKg;
    private final static int SEVEN = 7;
    private static int numKittens;
    private BasicCat[] catStorage = new BasicCat[0];
    private static int countCatsStorage;


    public static void main(String args[]) {
        BasicCat cat1 = new BasicCat("Barsik", 0.2, 4.5);
        BasicCat cat2 = new BasicCat("Ryzhik", 0.3, 1.1);
        BasicCat cat4 = new BasicCat("Pyzhik", 0.3, 1.1);
        BasicCat cat5 = new BasicCat("Syzhik", 5.3, 2.4);
        BasicCat cat3 = new BasicCat("Matilda");
        BasicCat cat6 = new BasicCat("Shmatilda");

        System.out.println(getNumKittens());
        System.out.println(getCountCatsStorage());
    }

    // объявим конструктор c параметрами
    BasicCat(String name, double age, double weight) {
        nameStr = name;
        ageYears = age;
        weightKg = weight;
        if (age < 1) {
            numKittens++;
        }
        addToCatStorage(this);
    }

    // Другой конструктор - на вход принимает только имя, например, других данных нет
    BasicCat(String name) {
        nameStr = name;
        ageYears = 0;
        weightKg = 0;
        addToCatStorage(this);
    }

    private BasicCat[] addToCatStorage(BasicCat cat) {
        BasicCat[] basicCats = Arrays.copyOf(catStorage, catStorage.length + 1);
        basicCats[basicCats.length - 1] = this;
        this.catStorage = basicCats;
        countCatsStorage++;
        return catStorage;
    }

    public double getHumanAgeOfCat(BasicCat cat) {
        return cat.ageYears * SEVEN;
    }

    public static String getNumKittens() {
        return "Count of kittens (> 1 year): " + numKittens;
    }

    public static String getCountCatsStorage() {
        return "Count of all cats: " + countCatsStorage;
    }
}
