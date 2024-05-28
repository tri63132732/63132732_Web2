package org2.NuyenTrongTri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org2.NuyenTrongTri.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}

