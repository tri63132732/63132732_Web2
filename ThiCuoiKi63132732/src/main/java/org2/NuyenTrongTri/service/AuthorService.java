package org2.NuyenTrongTri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org2.NuyenTrongTri.model.AuthorModel;
import org2.NuyenTrongTri.repositories.AuthorRepository;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    // Method to save an author
    public AuthorModel saveAuthor(AuthorModel author) {
        return authorRepository.save(author);
    }

    // Method to get all authors
    public List<AuthorModel> getAllAuthors() {
        return authorRepository.findAll();
    }

    // Method to get author by ID
    public AuthorModel getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    // Method to delete author by ID
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
