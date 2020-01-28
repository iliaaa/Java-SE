package HomeWork.Lab17.Library;

import java.util.HashSet;

public class Customer {
    private String name;
    private String surname;
    private HashSet<Book> ownLib = new HashSet<>();

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Customer setBook(Book book, LibraryBooks<Book> fromLib) {
        if (book.isFree() == true){
            ownLib.add(book);
            fromLib.remove(book);
            book.setFree(false);
            System.out.println("Book is added.");
        } else if (ownLib.contains(book)) {
                    System.out.println("Customer already have this book");
                } else {
                    System.out.println("Book is not added. Book is in use by another user.");
                }
        return this;
    }

    public Customer returnBook(Book book, LibraryBooks<Book> toLib) {
        if (ownLib.contains(book)) {
            ownLib.remove(book);
            toLib.add(book);
            book.setFree(true);
            System.out.println("Book is returned to library");
        }
        return this;
    }

    public String getOwnLib() {
        return this.name + " " +
                this.surname + ":\n" + ownLib;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
