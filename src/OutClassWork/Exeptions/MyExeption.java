package OutClassWork.Exeptions;

public class MyExeption extends Exception {
    private int details;

    MyExeption(int details) {
        this.details = details;
    }

    public String toString() {
        return "MyExeption[" + details + "]";
    }
}

class ExeptionDemo {
    static void compute(int a) throws MyExeption {
        System.out.println("Method compute is called(" + a + ")");
        if(a > 10) {
            throw new MyExeption(a);
        }
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyExeption e) {
            System.out.println("Exeption is catched: " + e);
        }
        try {
            compute(210);
        } catch (MyExeption myExeption) {
            myExeption.printStackTrace();
        }
    }
}
