package com.rafaelsantos.workshoopmongodb.repository;

import com.rafaelsantos.workshoopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}
