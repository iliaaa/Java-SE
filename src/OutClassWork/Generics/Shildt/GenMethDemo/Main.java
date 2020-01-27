package OutClassWork.Generics.Shildt.GenMethDemo;

import OutClassWork.Generics.Shildt.GenMethDemo.*;

public class Main {
    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};

        if (GenMethDemo.isIn(2, nums)) {
            System.out.println("2 is in");
        }

        if (!GenMethDemo.isIn(7, nums)) {
            System.out.println("7 is not in");
        }

        String[] st = {"one", "two", "three", "four"};

        if (GenMethDemo.isIn("one", st)) {
            System.out.println("one is in");
        }

//        if (GenMethDemo.isIn("five", nums))  два разных типа
    }
}
