package com.leonardo.springbootmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leonardo.springbootmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
