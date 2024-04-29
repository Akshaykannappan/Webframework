package com.example.day14ce2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.model.AkshayBook;
import com.example.day14ce2.service.BookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class AkshayBookController {
    @Autowired
    BookService bookService;

    @PostMapping("/api/book")
    public AkshayBook addBook(@RequestBody AkshayBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public AkshayBook updateBook(@PathVariable int id,@RequestBody AkshayBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<AkshayBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<AkshayBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
