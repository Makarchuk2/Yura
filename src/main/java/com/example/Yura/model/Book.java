package com.example.Yura.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="books")
public class Book {
    @Id
    @Column(name ="book_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID book_id;
    @Column(name ="book_name")
    private String book_name;
    @Column(name ="book_author")
    private String book_author;
    @Column(name ="book_year")
    private String book_year;
    @Column(name ="book_genre")
    private String book_genre;
    @Column(name ="book_price")
    private Integer book_price;

    public Book() {
    }

    public UUID getBook_id() {
        return book_id;
    }

    public void setBook_id(UUID book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_year() {
        return book_year;
    }

    public void setBook_year(String book_year) {
        this.book_year = book_year;
    }

    public String getBook_genre() {
        return book_genre;
    }

    public void setBook_genre(String book_genre) {
        this.book_genre = book_genre;
    }

    public Integer getBook_price() {
        return book_price;
    }

    public void setBook_price(Integer book_price) {
        this.book_price = book_price;
    }

    public Book(UUID book_id, String book_name, String book_author, String book_year, String book_genre, Integer book_price) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_year = book_year;
        this.book_genre = book_genre;
        this.book_price = book_price;
    }
}
