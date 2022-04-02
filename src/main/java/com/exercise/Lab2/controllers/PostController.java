package com.exercise.Lab2.controllers;

import com.exercise.Lab2.domain.Post;
import com.exercise.Lab2.dtos.PostDto;
import com.exercise.Lab2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;


    @GetMapping
    public List<PostDto> getAllPosts() {
        return postService.findAll();
    }

    // retrieve all the posts with id 1
    @GetMapping("/{id}")
    public PostDto getPostWithId(@PathVariable("id") int id){
        return postService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Post p) {
        postService.save(p);
    }
}