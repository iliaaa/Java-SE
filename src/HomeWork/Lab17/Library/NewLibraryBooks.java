package HomeWork.Lab17.Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NewLibraryBooks {
    private ArrayList<Book> lib = new ArrayList<>();

    public boolean add(Book book) {
        return lib.add(book);
    }

    public ArrayList<Book> getLib() {
        Collections.sort(lib);
        return lib;
    }

    public boolean remove(Book book) {
        return lib.remove(book);
    }

    public boolean contains(Book book) {
        return lib.contains(book);
    }

    @Override
    public String toString() {
        return "NewLibraryBooks{" +
                "lib=" + lib +
                '}';
    }

    public Book get(int i) {
        return lib.get(i);
    }
}