package HomeWork.Lab17.Library;

import java.util.*;

public class LibraryBooks<Book extends HomeWork.Lab17.Library.Book> extends AbstractList<Book> {

    ArrayList<HomeWork.Lab17.Library.Book> libB = new ArrayList<>();

    public boolean add(HomeWork.Lab17.Library.Book book) {
        libB.add(book);
        Collections.sort(libB, new Comparator<HomeWork.Lab17.Library.Book>() {
            @Override
            public int compare(HomeWork.Lab17.Library.Book o1, HomeWork.Lab17.Library.Book o2) {
                int compare = o1.getAuthName().compareTo(o2.getAuthName());
                if (compare == 0){
                    compare = o1.getBookName().compareTo(o2.getBookName());
                };
                return compare;
            }
        });
        return libB.contains(book);
    }

    @Override
    public int size() {
        return libB.size();
    }

    @Override
    public Book get(int index) {
        return (Book) libB.get(index);
    }

    public boolean remove(HomeWork.Lab17.Library.Book book) {
        return libB.remove(book);
    }
}
