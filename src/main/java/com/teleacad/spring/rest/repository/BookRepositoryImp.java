package com.teleacad.spring.rest.repository;

import com.teleacad.spring.rest.model.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryImp implements BookRepository{

    private final JdbcTemplate jdbcTemplate;

    public BookRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> getBooks() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public int addBook(Book book) {
        String sql = "INSERT INTO books(title, price) VALUES(?,?)";
        return jdbcTemplate.update(sql, book.getTitle(), book.getPrice());
    }

    @Override
    public int updateBook(int id) {
        String sql = "UPDATE books SET title = ?, price = ? WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int deleteBook(int id) {
        String sql = "DELETE FROM books WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
