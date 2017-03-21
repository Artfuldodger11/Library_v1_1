package interfaces;

import objects.Book;

/**
 * Created by Dmitry on 21/03/2017.
 */
public interface ShowBook {

    void showBook(Book book);
    void downloadBook(Book book);
    void voteBook(Book book);
}
