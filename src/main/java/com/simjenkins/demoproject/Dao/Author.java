package com.simjenkins.demoproject.Dao;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private List<Book> book;

    // Constructors
    public Author() {}
    public Author(Long id, String name,List<Book> book) {
        this.id = id;
        this.name = name;
        this.book=book;
    }

    // Getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public List<Book> getBooks() { return book; }
    public void setBooks(List<Book> book) { this.book = book; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
}
