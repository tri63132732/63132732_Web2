package org2.NuyenTrongTri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org2.NuyenTrongTri.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

