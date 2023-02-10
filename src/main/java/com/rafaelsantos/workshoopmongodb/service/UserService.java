package com.rafaelsantos.workshoopmongodb.service;

import com.rafaelsantos.workshoopmongodb.domain.User;
import com.rafaelsantos.workshoopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
    return userRepository.findAll();
    }
}
