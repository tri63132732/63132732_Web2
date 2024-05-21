package org2.NuyenTrongTri.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org2.NuyenTrongTri.model.GenreModel;
import org2.NuyenTrongTri.service.GenreService;

@Controller
@RequestMapping("/genres")
public class GenreController {
    
    @Autowired
    private GenreService genreService;

    @GetMapping
    public String getAllGenres(Model model) {
        List<GenreModel> genres = genreService.findAllGenres();
        model.addAttribute("genres", genres);
        return "indexGenre";
    }
    
    @GetMapping("/add")
    public String showAddGenreForm(Model model) {
        model.addAttribute("genre", new GenreModel());
        return "addGenre";
    }

    @PostMapping("/add")
    public String addGenre(@ModelAttribute("genre") GenreModel genre, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addGenre";
        }
        genreService.saveGenre(genre);
        return "redirect:/genres";
    }

    @GetMapping("/edit/{id}")
    public String showEditGenreForm(@PathVariable("id") long id, Model model) {
        Optional<GenreModel> genre = genreService.findGenreById(id);
        if (genre == null) {
            // handle genre not found, e.g., redirect to an error page or the genres list
            return "redirect:/genres";
        }
        model.addAttribute("genre", genre);
        return "editGenre";
    }

    @PostMapping("/edit")
    public String editGenre(@ModelAttribute("genre") GenreModel genre, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "editGenre";
        }
        genreService.saveGenre(genre);
        return "redirect:/genres";
    }
    @GetMapping("/delete/{id}")
    public String deleteGenre(@PathVariable Long id) {
        genreService.deleteGenreById(id);
        return "redirect:/genres";
    }
}
