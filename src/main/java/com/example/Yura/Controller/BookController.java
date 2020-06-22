package com.example.Yura.Controller;

import com.example.Yura.model.Book;
import com.example.Yura.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("list")
    public List<Book> getAll()
    {
        return bookService.getAll();
    }

    @GetMapping(path = "getid/{book_id}")
    public Book getId(@PathVariable UUID book_id)//пошук книжок по айді
    {
        return bookService.getId(book_id);
    }

    @GetMapping("getname/{book_name}")
    public Book getname(@PathVariable String book_name)
    {
        return bookService.getname(book_name);//пошук книжок по назві(тільки якщо немає повторюваних назв)
    }

    @GetMapping("getg/{book_genre}")
    public List<Book> getgenre(@PathVariable String book_genre)//вивід книжок по жанру(СПИСКОМ)
    {
        return bookService.getgenre(book_genre);
    }

    @DeleteMapping("delete/{book_id}")
    public void deleteBook(Book book)
    {
        bookService.deleteBook(book);
    }

    @PostMapping("update")
    public Book updateOrders(Book book)
    {
        return bookService.updateBook(book);
    }
    @PostMapping("create")
    public Book createBook(Book book) {
        return bookService.createBook(book);
    }



}