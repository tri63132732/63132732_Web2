package org2.NuyenTrongTri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org2.NuyenTrongTri.model.Genre;
import org2.NuyenTrongTri.service.GenreService;

@Controller
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping("/genres")
    public String index(Model model) {
        model.addAttribute("genres", genreService.getAllGenres());
        return "genre/index";
    }

    @GetMapping("/genres/create")
    public String createForm(Model model) {
        model.addAttribute("genre", new Genre());
        return "genre/create";
    }

    @PostMapping("/genres/create")
    public String createGenre(@ModelAttribute Genre genre) {
        genreService.saveGenre(genre);
        return "redirect:/genres";
    }

    @GetMapping("/genres/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Genre genre = genreService.getGenreById(id);
        model.addAttribute("genre", genre);
        return "genre/edit";
    }

    @PostMapping("/genres/edit")
    public String editGenre(@ModelAttribute Genre genre) {
        genreService.saveGenre(genre);
        return "redirect:/genres";
    }

    @GetMapping("/genres/delete/{id}")
    public String deleteForm(@PathVariable Long id, Model model) {
        Genre genre = genreService.getGenreById(id);
        model.addAttribute("genre", genre);
        return "genre/delete";
    }

    @PostMapping("/genres/delete")
    public String deleteGenre(@RequestParam Long id) {
        genreService.deleteGenre(id);
        return "redirect:/genres";
    }
}