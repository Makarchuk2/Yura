package com.example.Yura.service;

import com.example.Yura.model.Book;

import java.util.List;
import java.util.UUID;

public interface BookService {
    Book getId(UUID book_id);
    List<Book> getAll();
    Book getname(String book_name);
    List<Book> getgenre(String book_genre);
    Book createBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Book book);
}

