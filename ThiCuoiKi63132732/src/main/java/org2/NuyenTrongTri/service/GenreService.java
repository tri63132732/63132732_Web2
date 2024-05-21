package org2.NuyenTrongTri.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org2.NuyenTrongTri.model.GenreModel;
import org2.NuyenTrongTri.repository.GenreRepository;

@Service
public class GenreService {
    
    @Autowired
    private GenreRepository genreRepository;
    
    public List<GenreModel> findAllGenres() {
        return genreRepository.findAll();
    }
    
    public Optional<GenreModel> findGenreById(long id) {
        return genreRepository.findById(id);
    }
    
    public GenreModel saveGenre(GenreModel genre) {
        return genreRepository.save(genre);
    }
    
    public void deleteGenreById(long id) {
        genreRepository.deleteById(id);
    }
}
