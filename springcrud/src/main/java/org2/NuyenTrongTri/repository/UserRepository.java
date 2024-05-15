package org2.NuyenTrongTri.repository;

import org.springframework.data.repository.CrudRepository;  
import org.springframework.stereotype.Repository;

import org2.NuyenTrongTri.entity.User;  

@Repository  
public interface UserRepository extends CrudRepository<User, Long> {}
