package org2.NuyenTrongTri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org2.NuyenTrongTri.model.User;
import org2.NuyenTrongTri.model.Borrow;
import org2.NuyenTrongTri.model.Book;

import org2.NuyenTrongTri.service.UserService;
import org2.NuyenTrongTri.service.BorrowService;
import org2.NuyenTrongTri.service.BookService;


@Controller
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;
    

    
    @GetMapping("/borrows")
    public String index(Model model) {
        model.addAttribute("borrows", borrowService.getAllBorrows());
        return "borrow/index";
    }

    @GetMapping("/borrows/create")
    public String createForm(Model model) {
        model.addAttribute("borrow", new Borrow());
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("books", bookService.getAllBooks());

        return "borrow/create";
    }

    @PostMapping("/borrows/create")
    public String createBorrow(@ModelAttribute Borrow borrow, Model model, @RequestParam Long userId, @RequestParam Long bookId) {


        User user = userService.findById(userId);
        Book book = bookService.findById(bookId);

        
        borrow.setUser(user);
        borrow.setBook(book);

        
        borrowService.saveBorrow(borrow);
        return "redirect:/borrows";
    }

    @GetMapping("/borrows/edit/{id}")
    public String editForm(@PathVariable("id") Long id, Model model) {
        Borrow borrow = borrowService.findById(id);
        if (borrow == null) {
            return "redirect:/borrows";
        }
        model.addAttribute("borrow", borrow);
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("books", bookService.getAllBooks());

        return "borrow/edit";
    }

    @PostMapping("/borrows/edit")
    public String editBorrow( @ModelAttribute Borrow borrow, Model model, @RequestParam Long userId, @RequestParam Long bookId) {

    	User user = userService.findById(userId);
        Book book = bookService.findById(bookId);

        
        borrow.setUser(user);
        borrow.setBook(book);


        borrowService.saveBorrow(borrow);
        return "redirect:/borrows";
    }

    @GetMapping("/borrows/delete/{id}")
    public String deleteForm(@PathVariable Long id, Model model) {
        Borrow borrow = borrowService.getBorrowById(id);
        model.addAttribute("borrow", borrow);
        return "borrow/delete";
    }

    @PostMapping("/borrows/delete")
    public String deleteBorrow(@RequestParam Long id) {
        borrowService.deleteBorrow(id);
        return "redirect:/borrows";
    }
}
