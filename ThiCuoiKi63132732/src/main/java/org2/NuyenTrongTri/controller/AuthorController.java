package org2.NuyenTrongTri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org2.NuyenTrongTri.model.AuthorModel;
import org2.NuyenTrongTri.service.AuthorService;
import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<AuthorModel> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public AuthorModel getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public AuthorModel addAuthor(@RequestBody AuthorModel author) {
        return authorService.saveAuthor(author);
    }

    @PutMapping("/{id}")
    public AuthorModel updateAuthor(@PathVariable Long id, @RequestBody AuthorModel author) {
        author.setAuthorID(id);
        return authorService.saveAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }
}
