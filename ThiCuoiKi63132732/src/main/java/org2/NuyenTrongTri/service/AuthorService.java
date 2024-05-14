package org2.NuyenTrongTri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org2.NuyenTrongTri.model.AuthorModel;
import org2.NuyenTrongTri.repositories.AuthorRepository;

@Service
public class AuthorService {

    @Autowired
    private static AuthorRepository authorRepository;

    public static List<AuthorModel> getAllAuthors() {
        return authorRepository.findAll();
    }

    public static AuthorModel getAuthorById(int authorId) {
        return authorRepository.findById(authorId).orElse(null);
    }
}