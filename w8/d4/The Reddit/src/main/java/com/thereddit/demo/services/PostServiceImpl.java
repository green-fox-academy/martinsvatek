package com.thereddit.demo.services;

import com.thereddit.demo.models.Post;
import com.thereddit.demo.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public void upVote(Post post) {
        post.setNumberOfVotes(post.getNumberOfVotes() + 1);
        postRepo.save(post);
    }

    @Override
    public void downVote(Post post) {
        post.setNumberOfVotes(post.getNumberOfVotes() - 1);
        postRepo.save(post);
    }

    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public Post checkIfTitleIsNotAlreadyUsed (Post post){
        if (existingTitle(post.getTitle())){
            throw new IllegalArgumentException("Title is already used.");
        }
        else
            postRepo.save(post);
        return post;
    }

    public boolean existingTitle(String title){
        Optional<Post> optionalPost = postRepo.findByTitle(title);
        return optionalPost.isPresent();
    }

    public Post getMePostById(long id) {
        return postRepo.findById(id).get();
    }

    public void save(Post post){
        postRepo.save(post);
    }
}