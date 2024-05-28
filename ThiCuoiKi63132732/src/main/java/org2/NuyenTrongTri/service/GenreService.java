package org2.NuyenTrongTri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org2.NuyenTrongTri.model.Genre;
import org2.NuyenTrongTri.repository.GenreRepository;



@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    public Iterable<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    public Genre findById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }
    
    public Genre getGenreById(Long id) {
        return genreRepository.findById(id).orElse(null);
    }

    public void saveGenre(Genre genre) {
        genreRepository.save(genre);
    }

    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }
}
