package com.sphinxtodo.sphinxtodo.services;

import com.sphinxtodo.sphinxtodo.models.Users;
import com.sphinxtodo.sphinxtodo.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //GET METHODS
    public List<Users> getAllUser() {
        return this.userRepository.findAll();
    }

    public Users getUserId(Long id) {
        return userRepository.findById(id).orElse(new Users());
    }

    //POST
    public void addUser(Users users) {
        userRepository.save(users);
    }

    //PUT
    public void updateUser(Users users) {
        userRepository.save(users);
    }

    //DELETE
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
