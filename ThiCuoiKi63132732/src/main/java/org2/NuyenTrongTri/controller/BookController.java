package org2.NuyenTrongTri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org2.NuyenTrongTri.model.Author;
import org2.NuyenTrongTri.model.Book;
import org2.NuyenTrongTri.model.Genre;
import org2.NuyenTrongTri.model.NXB;
import org2.NuyenTrongTri.service.AuthorService;
import org2.NuyenTrongTri.service.BookService;
import org2.NuyenTrongTri.service.GenreService;
import org2.NuyenTrongTri.service.NXBService;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private GenreService genreService;
    
    @Autowired
    private NXBService nxbService;
    
    @GetMapping("/books")
    public String index(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book/index";
    }

    @GetMapping("/books/create")
    public String createForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("authors", authorService.getAllAuthors());
        model.addAttribute("genres", genreService.getAllGenres());
        model.addAttribute("nxbs", nxbService.getAllNXBs());
        return "book/create";
    }

    @PostMapping("/books/create")
    public String createBook(@ModelAttribute Book book, Model model, @RequestParam Long authorId, @RequestParam Long genreId, @RequestParam Long nxbId) {


        Author author = authorService.findById(authorId);
        Genre genre = genreService.findById(genreId);
        NXB nxb = nxbService.findById(nxbId);
        
        book.setAuthor(author);
        book.setGenre(genre);
        book.setNxb(nxb);
        
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String editForm(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findById(id);
        if (book == null) {
            return "redirect:/books";
        }
        model.addAttribute("book", book);
        model.addAttribute("authors", authorService.getAllAuthors());
        model.addAttribute("genres", genreService.getAllGenres());
        model.addAttribute("nxbs", nxbService.getAllNXBs());
        return "book/edit";
    }

    @PostMapping("/books/edit")
    public String editBook( @ModelAttribute Book book, Model model, @RequestParam Long authorId, @RequestParam Long genreId, @RequestParam Long nxbId) {

    	Author author = authorService.findById(authorId);
        Genre genre = genreService.findById(genreId);
        NXB nxb = nxbService.findById(nxbId);
        
        book.setAuthor(author);
        book.setGenre(genre);
        book.setNxb(nxb);

        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/books/delete/{id}")
    public String deleteForm(@PathVariable Long id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "book/delete";
    }

    @PostMapping("/books/delete")
    public String deleteBook(@RequestParam Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
}
