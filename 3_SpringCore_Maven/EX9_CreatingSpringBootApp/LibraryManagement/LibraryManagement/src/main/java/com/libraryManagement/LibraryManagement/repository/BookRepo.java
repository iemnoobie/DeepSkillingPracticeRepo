package com.libraryManagement.LibraryManagement.repository;

import com.libraryManagement.LibraryManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
}