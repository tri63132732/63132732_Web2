package org2.NuyenTrongTri.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org2.NuyenTrongTri.model.AuthorModel;
import org2.NuyenTrongTri.service.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public String getAllAuthors(Model model) {
        List<AuthorModel> authors = authorService.findAllAuthors();
        model.addAttribute("authors", authors);
        return "indexAuthor";
    }
    
    @GetMapping("/add")
    public String showAddAuthorForm(Model model) {
        model.addAttribute("author", new AuthorModel());
        return "addAuthor";
    }

    @PostMapping("/add")
    public String addAuthor(@ModelAttribute("author") AuthorModel author, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addAuthor";
        }
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }

    @GetMapping("/edit/{id}")
    public String showEditAuthorForm(@PathVariable("id") long id, Model model) {
        Optional<AuthorModel> author = authorService.findAuthorById(id);
        if (author == null) {
            // handle author not found, e.g., redirect to an error page or the authors list
            return "redirect:/authors";
        }
        model.addAttribute("author", author);
        return "editAuthor";
    }

    @PostMapping("/edit")
    public String editAuthor(@ModelAttribute("author") AuthorModel author, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "editAuthor";
        }
        authorService.saveAuthor(author);
        return "redirect:/authors";
    }
    @GetMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthorById(id);
        return "redirect:/authors";
    }
}
