package HomeWork.Lab5;

public class TruthTable {
    boolean[] aArr = {true, false};

    void AND(){
        for (boolean a : aArr) {
            for (boolean b : aArr) {
                System.out.println(a + " && " + b + " | " + (a && b));
            }
        }
        System.out.println();
    }

    void OR(){
        for (boolean a : aArr) {
            for (boolean b : aArr) {
                System.out.println(a + " || " + b + " | " + (a || b));
            }
        }
        System.out.println();
    }

    void NAND(){
        for (boolean a : aArr) {
            System.out.println(a + " !" + a + " = " + (a != a));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TruthTable truthTable = new TruthTable();
        truthTable.AND();
        truthTable.NAND();
        truthTable.OR();
       // truthTable.anotherAnd();
    }
}
