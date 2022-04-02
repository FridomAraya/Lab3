package com.exercise.Lab2.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "post_name")
    String name;

    @OneToMany(mappedBy = "user")
    List<Post> posts;
}
