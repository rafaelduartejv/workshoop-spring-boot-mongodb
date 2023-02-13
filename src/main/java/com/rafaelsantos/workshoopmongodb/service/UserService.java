package com.rafaelsantos.workshoopmongodb.service;

import com.rafaelsantos.workshoopmongodb.domain.User;
import com.rafaelsantos.workshoopmongodb.dto.UserDTO;
import com.rafaelsantos.workshoopmongodb.repository.UserRepository;
import com.rafaelsantos.workshoopmongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
    return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return userRepository.insert(obj);
    }

    public void delete(String id){
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(User obj){
        Optional<User> newObj = userRepository.findById(obj.getId());
        updateData(newObj, obj);
        return userRepository.save(obj);
    }

    private void updateData(Optional<User> newObj, User obj) {
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
