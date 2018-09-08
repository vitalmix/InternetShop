package com.company.services;

import com.company.data.User;
import com.company.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

   // @PostConstruct
    public void createUser(){
        User user = new User("testName", "testSurname","testLogin"
                ,"testPassword","testEmail");
        userRepository.save(user);
    }
}
