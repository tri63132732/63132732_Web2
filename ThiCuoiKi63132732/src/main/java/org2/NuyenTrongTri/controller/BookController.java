package org2.NuyenTrongTri.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org2.NuyenTrongTri.model.BookModel;
import org2.NuyenTrongTri.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping
    public String getAllBooks(Model model) {
        List<BookModel> books = bookService.findAllBooks();
        model.addAttribute("books", books);
        return "indexBook";
    }
    
    @GetMapping("/add")
    public String showAddBookForm(Model model) {
        model.addAttribute("book", new BookModel());
        return "addBook";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute("book") BookModel book, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addBook";
        }
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String showEditBookForm(@PathVariable("id") long id, Model model) {
        Optional<BookModel> book = bookService.findBookById(id);
        if (book == null) {
            // handle book not found, e.g., redirect to an error page or the books list
            return "redirect:/books";
        }
        model.addAttribute("book", book);
        return "editBook";
    }

    @PostMapping("/edit")
    public String editBook(@ModelAttribute("book") BookModel book, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "editBook";
        }
        bookService.saveBook(book);
        return "redirect:/books";
    }
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }
}
