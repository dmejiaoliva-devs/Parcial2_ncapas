package com.example.parcial.Service;

import com.example.parcial.Domain.DTO.BookDTO;
import com.example.parcial.Domain.Entities.Book;

import java.util.UUID;

public interface iBookServices {
    public Book create(BookDTO data) throws Exception;
    public Book update(UUID id, String title, String language) throws Exception;
    public Book delete(UUID id) throws Exception;

}
