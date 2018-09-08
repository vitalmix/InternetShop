package com.company.repositories;

import com.company.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, Long> {

    User findByLogin(String login);

}