package com.example.parcial.Controllers;

import com.example.parcial.Domain.DTO.BookDTO;
import com.example.parcial.Domain.Entities.Book;
import com.example.parcial.Service.Implementation.BookImplementation;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/books")
public class BookController {
    private final BookImplementation bookImplementation;

    @PostMapping("/create")
    public Book createBook(@RequestBody @Valid BookDTO data) throws Exception {
       return bookImplementation.create(data);
    }

    @PatchMapping("/update")
    public Book updateBook(@RequestParam @Valid String id, @RequestParam  @Valid String title, @RequestParam @Valid String language) throws Exception {
        return bookImplementation.update(UUID.fromString(id), title, language);

    }

    @DeleteMapping("/delete")
    public Book deleteBook(@RequestParam @Valid String id) throws Exception {
        return bookImplementation.delete(UUID.fromString(id));
    }


}
