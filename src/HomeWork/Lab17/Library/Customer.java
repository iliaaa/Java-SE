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

    public Customer setBook(Book book, NewLibraryBooks fromLib) {
        if (book.isFree() == true) {
            ownLib.add(book);
            fromLib.remove(book);
            book.setFree(false);
            System.out.println("Book is added.");
        } else if (ownLib.contains(book)) {
            System.out.println("Customer already have this book");
        } else if (!(book.cusQ.contains(this))) {
            book.cusQ.offer(this);
            System.out.println("Book is not added. Book is in use by another user. " +
                    "You will be in the queue.");
        } else {
            System.out.println("Customer already in queue");
        }
        return this;
    }

    public Customer returnBook(Book book, NewLibraryBooks toLib) {
        if (ownLib.contains(book) && book.cusQ.size() != 0) {
            removeAddSetFree(book, toLib);
            book.cusQ.element().setBook(book, toLib);
            System.out.println("Book in use by another customer.");
        } else if (ownLib.contains(book)){
            removeAddSetFree(book, toLib);
            System.out.println("Book is returned to library.");
        } else {
            System.out.println("This customer have not this book.");
        }
        return this;
    }

    private void removeAddSetFree(Book book, NewLibraryBooks toLib){
        ownLib.remove(book);
        toLib.add(book);
        book.setFree(true);
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

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
