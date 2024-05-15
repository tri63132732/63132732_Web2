package org2.NuyenTrongTri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org2.NuyenTrongTri.model.AuthorModel;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorModel, Long> {
    // You can add custom query methods here if needed
}
