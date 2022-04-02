package com.exercise.Lab2.domain;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity  // add this to persistence layer/ database as a table with columns id, title, content, and author
public class Post {

    @Id    // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private String author;

    @ManyToOne
    @JoinColumn
    private User user;


}
