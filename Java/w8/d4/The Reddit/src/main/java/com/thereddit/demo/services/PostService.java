package com.thereddit.demo.services;

import com.thereddit.demo.models.Post;

import java.util.List;

public interface PostService {

    void upVote(Post post);

    void downVote(Post post);

    Post getMePostById(long id);

    void save(Post post);

    List<Post> findAll();

    Post checkIfTitleIsNotAlreadyUsed (Post post);
}