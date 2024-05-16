package org2.NuyenTrongTri.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org2.NuyenTrongTri.model.AuthorModel;
import org2.NuyenTrongTri.repository.AuthorRepository;

@Service
public class AuthorService {
    
    @Autowired
    private AuthorRepository authorRepository;
    
    public List<AuthorModel> findAllAuthors() {
        return authorRepository.findAll();
    }
    
    public Optional<AuthorModel> findAuthorById(long id) {
        return authorRepository.findById(id);
    }
    
    public AuthorModel saveAuthor(AuthorModel author) {
        return authorRepository.save(author);
    }
    
    public void deleteAuthorById(long id) {
        authorRepository.deleteById(id);
    }
}
