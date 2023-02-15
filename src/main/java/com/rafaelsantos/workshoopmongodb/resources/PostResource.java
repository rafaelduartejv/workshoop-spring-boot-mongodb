package com.rafaelsantos.workshoopmongodb.resources;

import com.rafaelsantos.workshoopmongodb.domain.Post;
import com.rafaelsantos.workshoopmongodb.domain.User;
import com.rafaelsantos.workshoopmongodb.dto.UserDTO;
import com.rafaelsantos.workshoopmongodb.service.PostService;
import com.rafaelsantos.workshoopmongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value ="/posts")
public class PostResource {

    @Autowired
    private PostService postService;


    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
