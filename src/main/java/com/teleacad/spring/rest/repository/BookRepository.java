package com.teleacad.spring.rest.repository;

import com.teleacad.spring.rest.model.Book;

import java.util.List;

public interface BookRepository {


    List<Book> getBooks();
    int addBook(Book book);
    int updateBook(int id);
    int deleteBook(int id);

}
