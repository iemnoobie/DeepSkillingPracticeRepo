package com.libraryManagement.LibraryManagement.service;

import com.libraryManagement.LibraryManagement.model.Book;

import java.util.List;

public interface BookImplementation {
    void saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(int bookId);
    Book updateBook(int bookId, Book updatedBook);
    void deleteBook(int bookId);

}