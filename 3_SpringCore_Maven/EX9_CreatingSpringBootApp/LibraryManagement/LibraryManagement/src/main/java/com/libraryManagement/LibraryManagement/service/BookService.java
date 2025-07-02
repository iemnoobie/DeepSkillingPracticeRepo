package com.libraryManagement.LibraryManagement.service;

import com.libraryManagement.LibraryManagement.model.Book;
import com.libraryManagement.LibraryManagement.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookImplementation{

    @Autowired
    private BookRepo repo;

    @Override
    public void saveBook(Book book) {
        repo.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    @Override
    public Book getBookById(int bookId) {
        return repo.findById(bookId).orElse(null);
    }

    @Override
    public Book updateBook(int bookId, Book updatedBook) {
        return repo.findById(bookId)
                .map(book -> {
                    book.setBookAuthor(updatedBook.getBookAuthor());
                    book.setBookGenre(updatedBook.getBookGenre());
                    book.setBookPrice(updatedBook.getBookPrice());
                    return repo.save(book);
                }).orElse(null);
    }

    @Override
    public void deleteBook(int bookId) {
        repo.deleteById(bookId);

    }
}
