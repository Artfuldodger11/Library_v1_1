package interfaces;

import objects.Author;
import objects.Book;
import objects.Genre;

import java.util.List;

/**
 * Created by Dmitry on 21/03/2017.
 */
public interface BookSearch {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);

}
