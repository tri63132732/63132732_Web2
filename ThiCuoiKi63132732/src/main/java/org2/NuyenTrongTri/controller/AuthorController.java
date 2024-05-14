package org2.NuyenTrongTri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org2.NuyenTrongTri.model.AuthorModel;
import org2.NuyenTrongTri.service.AuthorService;
import org2.NuyenTrongTri.repositories.AuthorRepository;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    // Create a new author
    @PostMapping
    public AuthorModel createAuthor(@RequestBody AuthorModel author) {
        return authorRepository.save(author);
    }

    // Retrieve all authors
    @GetMapping("/authors")
    public List<AuthorModel> getAllAuthors() {
        return AuthorService.getAllAuthors();
    }

    @GetMapping("/authors/{authorId}")
    public AuthorModel getAuthorById(@PathVariable int authorId) {
        return AuthorService.getAuthorById(authorId);
    }

    // Update an existing author
    @PutMapping("/{id}")
    public AuthorModel updateAuthor(@PathVariable int id, @RequestBody AuthorModel updatedAuthor) {
        return authorRepository.findById(id)
                .map(author -> {
                    author.setAuthorName(updatedAuthor.getAuthorName());
                    author.setAuthorAlias(updatedAuthor.getAuthorAlias());
                    author.setAuthorEmail(updatedAuthor.getAuthorEmail());
                    return authorRepository.save(author);
                })
                .orElseThrow(() -> new RuntimeException("Author not found with id: " + id));
    }

    // Delete an author
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id) {
        authorRepository.deleteById(id);
    }
}