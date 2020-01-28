package HomeWork.Lab17.Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Dostoevsky", "prest i nakaz");
        Book book3 = new Book("Dostoevsky", "karamazovi bros");
        Book book1 = new Book("Chehov", "vishnevy sad");
        Book book2 = new Book("lem", "solyaris");

//        ArrayList<Book> library = new ArrayList<>();

//        library.add(book);
//        library.add(book1);
//        library.add(book2);
        LibraryBooks<Book> library = new LibraryBooks<>();
        library.add(book);
        library.add(book3);
        library.add(book2);
        library.add(book1);
        System.out.println("lib have dostoevsky: " + library.contains(book));
        System.out.println("lib: " + library);
        System.out.println("book with index 0: " + library.get(0));
        System.out.println();

        Customer customer1 = new Customer("Ivan","Ivanovich");
        Customer customer2 = new Customer("Kizim","Mahmedovich");
        Customer customer3 = new Customer("Salam","Aleikovich");

        customer1.setBook(book, library);
        customer1.setBook(book, library);
        customer1.setBook(book3, library);
        System.out.println("lib: " + library);
        System.out.println();

        System.out.println("prest i naz is free? - " + book.isFree());
        System.out.println("lib: " + library);
        System.out.println();
//        System.out.println(customer1.getOwnLib());
        customer2.setBook(book, library);
        customer1.returnBook(book, library);
        System.out.println(library);
        System.out.println();
        System.out.println(customer1.getOwnLib());
    }
}
