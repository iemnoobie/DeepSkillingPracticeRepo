package com.libraryManagement.LibraryManagement.controller;

import com.libraryManagement.LibraryManagement.model.Book;
import com.libraryManagement.LibraryManagement.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public void createBook(@RequestBody Book book){
         service.saveBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @PostMapping("/{bookId}")
    public Book getBookById(@PathVariable int bookId){
        return service.getBookById(bookId);
    }

    @PutMapping("/{bookId}")
    public Book updateBook(@PathVariable int bookId,@RequestBody Book updatedBook){
        return service.updateBook(bookId,updatedBook);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable int bookId){
        service.deleteBook(bookId);
    }
}
