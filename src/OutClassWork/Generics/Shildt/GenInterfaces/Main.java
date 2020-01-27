package OutClassWork.Generics.Shildt.GenInterfaces;

public class Main {
    public static void main(String[] args) {
        Integer[] inums = {3, 1, 5, 6, 2, 0};
        Character[] chs = {'d', 'r', 'q', 'a', 'g'};

        MyClass<Integer> iMyClass = new MyClass<>(inums);
        MyClass<Character> chMyClass = new MyClass<>(chs);
        System.out.println("max inum: " + iMyClass.max());
        System.out.println("min inum: " + iMyClass.min());
        System.out.println("max chs: " + chMyClass.max());
        System.out.println("min chs: " + chMyClass.min());
    }
}
