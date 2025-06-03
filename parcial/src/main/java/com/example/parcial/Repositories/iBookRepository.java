package com.example.parcial.Repositories;

import com.example.parcial.Domain.Entities.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

@Transactional
public interface iBookRepository extends iGenericRepository<Book, UUID> {
    // JPA
    public Book findByAutor(String autor);

    public Book findByLanguage(String language);

    public Book findByGenre(String genre);

    public Book findByISBN(String ISBN);

    public Book findByPages(Integer minPages, Integer maxPages);

    // Hybrid Query
    @Query("SELECT b FROM Book b WHERE b.title = :title")
    public Book findByNameHybridQuery(@Param("title") String title);

}