package com.example.Yura.service;

import com.example.Yura.model.Book;
import com.example.Yura.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getId(UUID book_id) {
        return bookRepository.findById(book_id).get();
    }

    @Override
    public Book getname(String book_name) {
        Book book = new Book();
        book.setBook_name(book_name);
        return bookRepository.findOne(Example.of(book)).get();
    }
    @Override
    public List<Book> getgenre(String book_genre) {
        Book book = new Book();
        book.setBook_genre(book_genre);
        return bookRepository.findAll(Example.of(book));
    }

    @Override
    public Book createBook(Book books) {
        Book save = bookRepository.save(books);
        return save;
    }
    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

}