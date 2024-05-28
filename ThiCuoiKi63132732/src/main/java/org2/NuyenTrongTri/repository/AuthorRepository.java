package org2.NuyenTrongTri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org2.NuyenTrongTri.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}