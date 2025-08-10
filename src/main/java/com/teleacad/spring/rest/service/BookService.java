package com.teleacad.spring.rest.service;

import com.teleacad.spring.rest.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getBooks();
    int addBook(Book book);
    int updateBook(int id);
    int deleteBook(int id);

}
