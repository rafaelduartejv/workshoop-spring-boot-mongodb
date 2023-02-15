package com.rafaelsantos.workshoopmongodb.repository;

import com.rafaelsantos.workshoopmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
