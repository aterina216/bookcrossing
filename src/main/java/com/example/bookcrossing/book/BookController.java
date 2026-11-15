package com.example.bookcrossing.book;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> getBooks(@RequestParam(required = false) String city){
        if (city != null) {
            return bookRepository.findAllByCity(city);
        }
        return bookRepository.findAll();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }
}
