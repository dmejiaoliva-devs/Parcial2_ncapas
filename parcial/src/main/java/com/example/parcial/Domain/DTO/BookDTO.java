package com.example.parcial.Domain.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ISBN;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

    @NotEmpty
    @NotNull
    private String Id;

    @NotEmpty
    @NotNull
    private String title;

    @NotEmpty
    @NotNull
    private String author;

    @NotEmpty
    @NotNull
    @ISBN
    private String isbn;

    @NotEmpty
    @NotNull
    @Min(value = 1900, message = "Publication year must be after 1900")
    private Integer publicationYear;

    @NotEmpty
    @NotNull
    private String language;

    @NotEmpty
    @NotNull
    @Min(value = 10, message = "Pages must be at least 10")
    private Integer pages;

    @NotEmpty
    @NotNull
    private String Genre;

}
