package com.example.itinformationssakerhet.data;

import com.example.itinformationssakerhet.exception.BookNotFoundException;
import com.example.itinformationssakerhet.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookRepository {
    public List<Book> getAllBooks() {
        return List.of(
                new Book(1, "1984", "George Orwell"),
                new Book(2, "Brave New World", "Aldous Huxley")
        );
    }

    public Book getBookByID(int id){
        return getAllBooks().stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("No book found with " +id));
    }
}
