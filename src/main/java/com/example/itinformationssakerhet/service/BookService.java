package com.example.itinformationssakerhet.service;

import com.example.itinformationssakerhet.data.BookRepository;
import com.example.itinformationssakerhet.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks() {
        return bookRepository.getAllBooks();
    }

    public Book getBookById(int id){
        return bookRepository.getBookByID(id);
    }
}
