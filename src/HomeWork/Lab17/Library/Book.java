package HomeWork.Lab17.Library;

import java.util.LinkedList;
import java.util.Queue;

public class Book implements Comparable<Book>{
//public class Book{
    private String authName;
    private String bookName;
    private boolean isFree;
    Queue<Customer> cusQ = new LinkedList<Customer>();

    public Book(String authName, String bookName) {
        this.authName = authName;
        this.bookName = bookName;
        this.isFree = true;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isFree() {
        return isFree;
    }

    public String getAuthName() {
        return authName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public int compareTo(Book o) {
        return this.authName.compareTo(o.authName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authName='" + authName + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
