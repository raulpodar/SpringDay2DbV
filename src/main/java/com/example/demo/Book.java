package com.example.demo;

import javax.persistence.*;

@Entity()
@Table()
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String title;

    @Column
    private int page;

    @Column
    private String author;

    @Column
    private String genre;

    private String category;
}
