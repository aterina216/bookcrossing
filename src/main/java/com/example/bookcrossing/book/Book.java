package com.example.bookcrossing.book;
import jakarta.persistence.*;



import java.time.Instant;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String city;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt = Instant.now();

    public Book(String title, String author, String city){
        this.title = title;
        this.author = author;
        this.city = city;
    }

    public Long getId() {return id;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getCity() {return city;}
    public Instant getCreatedAt() {return createdAt;}

    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setCity(String city) {this.city = city;}
}
