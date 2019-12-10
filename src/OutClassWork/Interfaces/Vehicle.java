package OutClassWork.Interfaces;

public interface Vehicle {

    void start();

    void ride();

    void stop();

    default void signal() {
        System.out.println("Realise your own beep");
    }

    static void statMeth(){
        System.out.println("It's a static method");
    }

}
