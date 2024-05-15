package org2.NuyenTrongTri.service;

import java.util.List;  
import java.util.Optional;

import org2.NuyenTrongTri.entity.User;  

public interface UserService {  
  List<User> getAllUser();  

  void saveUser(User user);  

  void deleteUser(Long id);  

  Optional<User> findUserById(Long id);  
}
