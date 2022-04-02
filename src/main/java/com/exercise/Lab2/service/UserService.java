package com.exercise.Lab2.service;


import com.exercise.Lab2.domain.Post;
import com.exercise.Lab2.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(long id);
    void save(User user);
    void deleteById(long id);
    List<Post> findUserPosts(long id);



}
