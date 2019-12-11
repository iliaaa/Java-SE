package ClassWork.Lecture13;

public class Person extends Apes{
    private String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;


    }

    public static void main(String[] args) {
        Person vasya = new Person("vasya", 21);

        System.out.println(vasya.getAge() + ", " + vasya.getName());

        vasya.setName("ne vasya");

        System.out.println(vasya.getName());
    }

    @Override
    void eatBanana() {
        System.out.println("banana is eated");
    }

    void eatBanana(String action) {
        System.out.println(action);
    }

//    @Override
//    public Integer countLegs() {
//        return 4;
//    }

    @Override
    public Number countLegs() {
        return super.countLegs();
    }

}
