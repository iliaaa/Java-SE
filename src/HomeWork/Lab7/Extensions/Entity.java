package HomeWork.Lab7.Extensions;

abstract class Entity {
    final boolean isAnimal;
    boolean isExist;

    public Entity(boolean isAnimal) {
        this.isAnimal = isAnimal;
        System.out.println("This entity is exist: " + (this.isExist = true));
    }

    protected void startLiving(){
        System.out.println("I was born!");
    }

    protected void stopLiving(){
        System.out.println("I'm dead(inside) :(");
        isExist = false;
    }

    public abstract void eat();
}
