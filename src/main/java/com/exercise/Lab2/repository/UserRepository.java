package com.exercise.Lab2.repository;

import com.exercise.Lab2.domain.Post;
import com.exercise.Lab2.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();
    User findById(long id);

    @Query("select u.posts from User u where u.id= :id")
    List<Post> findUserPosts(@Param("id") long id);
}
