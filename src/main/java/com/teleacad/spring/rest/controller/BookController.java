package com.teleacad.spring.rest.controller;

import com.teleacad.spring.rest.model.Book;
import com.teleacad.spring.rest.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/add")
    public int addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("/update/{id}")
    private int updateBook(@PathVariable("id") int id, @RequestBody Book newBook){
        return bookService.updateBook(id, newBook);
    }
}
