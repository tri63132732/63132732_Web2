package org2.NuyenTrongTri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org2.NuyenTrongTri.model.GenreModel;



public interface GenreRepository extends JpaRepository<GenreModel, Long> {
}