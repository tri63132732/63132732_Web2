package org2.NuyenTrongTri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org2.NuyenTrongTri.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long> {
}