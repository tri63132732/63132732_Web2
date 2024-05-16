package org2.NuyenTrongTri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org2.NuyenTrongTri.model.AuthorModel;

public interface AuthorRepository extends JpaRepository<AuthorModel, Long> {
}