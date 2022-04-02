package com.exercise.Lab2.service;

import com.exercise.Lab2.domain.Post;
import com.exercise.Lab2.dtos.PostDto;


import java.util.List;

public interface PostService {

    List<PostDto> findAll();
    PostDto findById(long id);
    void addPost(PostDto postDto);

    void deletePost(long id);

    void update(long id, Post newPost);

    void save(Post p);
}
