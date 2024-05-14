package org2.NuyenTrongTri.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org2.NuyenTrongTri.model.AuthorModel;

public interface AuthorRepository extends JpaRepository<AuthorModel, Integer> {
    Optional<AuthorModel> findById(int id);
    List<AuthorModel> findAll();
    void deleteById(int id);
    AuthorModel save(AuthorModel author);
}
	