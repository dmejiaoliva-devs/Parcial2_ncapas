package com.example.parcial.Service.Implementation;

import com.example.parcial.Domain.DTO.BookDTO;
import com.example.parcial.Domain.Entities.Book;
import com.example.parcial.Repositories.iBookRepository;
import com.example.parcial.Service.iBookServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BookImplementation implements iBookServices {

    private final iBookRepository bookRepository;

    public Book create(BookDTO data) throws Exception {
        if (data != null) {
            Book book = new Book();
            book.setIdBook(UUID.randomUUID());
            book.setTitle(data.getTitle());
            book.setAutor(data.getAuthor());
            book.setISBN(data.getIsbn());
            book.setPublicYear(data.getPublicationYear());
            book.setLanguage(data.getLanguage());
            book.setPages(data.getPages());
            book.setGenre(data.getGenre());

            return bookRepository.save(book);
        } else {
            throw new Exception("Book already exists");
        }
    }

    public Book update(UUID id, String title, String language) throws Exception {
        Book bookToUpdate = bookRepository.findById(id).orElseThrow();
        bookToUpdate.setTitle(title);
        bookToUpdate.setLanguage(language);

        return bookRepository.save(bookToUpdate);
    }

    public Book delete(UUID id) throws Exception {
        Book bookToDelete = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(bookToDelete);
        return bookToDelete;
    }

}