package interfaces;

import objects.Book;

/**
 * Created by Dmitry on 21/03/2017.
 */
public interface EditBook {

    boolean save(Book book);
    boolean delete(Book book);
    boolean edit(Book book);
    boolean add(Book book);
}
