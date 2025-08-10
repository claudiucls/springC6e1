package com.teleacad.spring.rest.service;

import com.teleacad.spring.rest.model.Book;
import com.teleacad.spring.rest.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    @Override
    public int addBook(Book book) {
        return bookRepository.addBook(book);
    }

    @Override
    public int updateBook(int id) {
        return bookRepository.updateBook(id);
    }

    @Override
    public int deleteBook(int id) {
        return bookRepository.deleteBook(id);
    }
}
