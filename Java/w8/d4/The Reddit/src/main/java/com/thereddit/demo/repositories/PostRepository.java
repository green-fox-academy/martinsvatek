package com.thereddit.demo.repositories;

import com.thereddit.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> { // It contains methods such as save, findById, delete ,count etc.

    List<Post> findAll();

    Optional<Post> findByTitle(String title);

    Post findById(Post post);
}
