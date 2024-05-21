package org2.NuyenTrongTri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org2.NuyenTrongTri.model.BookModel;



public interface BookRepository extends JpaRepository<BookModel, Long> {
}