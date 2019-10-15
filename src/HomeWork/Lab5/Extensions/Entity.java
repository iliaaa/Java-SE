package HomeWork.Lab5.Extensions;

class Entity {
    final boolean isAnimal;
    final boolean isExist;

    public Entity(boolean isAnimal) {
        this.isAnimal = isAnimal;
        System.out.println("This entity is exist: " + (this.isExist = true));
    }

    protected void startLiving(){
        System.out.println("I was born!");
    }

    void eat(){
        System.out.println("I'm eating!");
    }

    protected void stopLiving(){
        System.out.println("I'm dead(inside) :(");
    }
}
