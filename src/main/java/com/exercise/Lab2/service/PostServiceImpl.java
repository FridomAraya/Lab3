package com.exercise.Lab2.service;

import com.exercise.Lab2.domain.Post;
import com.exercise.Lab2.dtos.PostDto;
import com.exercise.Lab2.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public List<PostDto> findAll() {
        var allPosts= postRepository.findAll();
        return allPosts.stream().map(post->mapper.map(post, PostDto.class)).collect(Collectors.toList());
    }

    @Override
    public PostDto findById(long id) {
        var post= postRepository.findById(id).get();
//        PostDto postDto= new PostDto(
//                post.getId(),
//                post.getTitle(),
//                post.getContent(),
//                post.getAuthor()
//        );
        //instead of manual mapping like above, we may use ModelMapper to convert Post to PostDto
        PostDto postDto= mapper.map(post, PostDto.class);
        return postDto;
    }

    @Override
    public void addPost(PostDto postDto) {
        postRepository.save(mapper.map(postDto, Post.class));
    }

    @Override
    public void deletePost(long id) {

        postRepository.deleteById(id);
    }

    @Override
    public void update(long id, Post newPost) {
        postRepository.deleteById(id);
        postRepository.save(newPost);
    }

    @Override
    public void save(Post p) {
        postRepository.save(p);
    }
}
