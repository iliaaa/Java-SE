package OutClassWork.Generics;

public class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

//    private void run() {
//        System.out.println("");
//        http://www.java.ru
//        return;
//    }

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>("");
//        objectBox.run();
    }
}
