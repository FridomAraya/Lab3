package com.exercise.Lab2.repository;

import com.exercise.Lab2.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
//CrudRepository<--, --> takes the domain type and the id
public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findAll();
    // will automatically change the default return type of findById (Optional) to List
    Post findById(int id);
//
//    Post save(Post post);

//    void deleteById(int id);

//    void update(int id, Post newPost);
}
