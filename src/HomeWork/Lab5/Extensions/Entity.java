package HomeWork.Lab5.Extensions;

class Entity {
    final boolean isAnimal;
    boolean isExist;

    public Entity(boolean isAnimal, boolean isExist) {
        this.isAnimal = isAnimal;
        this.isExist = isExist;
    }

    protected void startLiving(){
        System.out.println("I was born!");
    }

    void eat(){
        System.out.println("I'm eating!");
    }

    protected void stopLiving(){
        System.out.println("I'm dead(inside)!");
    }
}
