package org2.NuyenTrongTri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org2.NuyenTrongTri.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

