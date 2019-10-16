package HomeWork.Lab5.Extensions;

class Entity extends Eat{
    final boolean isAnimal;
    final boolean isExist;

    public Entity(boolean isAnimal) {
        this.isAnimal = isAnimal;
        System.out.println("This entity is exist: " + (this.isExist = true));
    }

    protected void startLiving(){
        System.out.println("I was born!");
    }

    protected void stopLiving(){
        System.out.println("I'm dead(inside) :(");
    }
}
