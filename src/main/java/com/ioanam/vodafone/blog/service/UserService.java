package com.ioanam.vodafone.blog.service;

import com.ioanam.vodafone.blog.entities.User;
import com.ioanam.vodafone.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public void saveOrUpdate(User user) {

        userRepository.save(user);
    }
    
}
