package com.example.Yura.repo;

import com.example.Yura.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID>
{
}
