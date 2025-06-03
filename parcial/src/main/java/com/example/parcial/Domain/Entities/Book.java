package com.example.parcial.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idBook;

    @Column
    private String title;

    @Column
    private String autor;

    @Column
    private String ISBN;

    @Column
    private Integer publicYear;

    @Column
    private String language;

    @Column
    private Integer pages;

    @Column
    private String genre;
}
