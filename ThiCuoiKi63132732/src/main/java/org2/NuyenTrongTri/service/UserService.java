package org2.NuyenTrongTri.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org2.NuyenTrongTri.model.UserModel;
import org2.NuyenTrongTri.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<UserModel> findAllUsers() {
        return userRepository.findAll();
    }
    
    public Optional<UserModel> findUserById(long id) {
        return userRepository.findById(id);
    }
    
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }
    
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }
}
