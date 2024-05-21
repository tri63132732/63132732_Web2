package org2.NuyenTrongTri.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org2.NuyenTrongTri.model.BookModel;
import org2.NuyenTrongTri.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    
    public List<BookModel> findAllBooks() {
        return bookRepository.findAll();
    }
    
    public Optional<BookModel> findBookById(long id) {
        return bookRepository.findById(id);
    }
    
    public BookModel saveBook(BookModel book) {
        return bookRepository.save(book);
    }
    
    public void deleteBookById(long id) {
        bookRepository.deleteById(id);
    }
}
