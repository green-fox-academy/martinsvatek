package com.thereddit.demo.controllers;

import com.thereddit.demo.models.Post;
import com.thereddit.demo.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String mainSite(@RequestParam(required = false) String title,
                             @RequestParam(required = false) String url,
                             @RequestParam(required = false) String description,
                             @RequestParam(required = false) boolean error,
                             Model model) {
        model.addAttribute("title", title);
        model.addAttribute("url", url);
        model.addAttribute("description", description);
        model.addAttribute("error", error);
        return "newpost";
    }

    @PostMapping("/")
    public String postSend(Post post) {
        Post newPost = null;
        try {
            newPost = postService.checkIfTitleIsNotAlreadyUsed(post);
        } catch (IllegalArgumentException ex) {
            return "redirect:/?error=true";
        }
        return "redirect:/?title=" + newPost.getTitle() + "&url=" + newPost.getUrl();
    }

    @GetMapping("/allposts")
    public String showPosts(Model model){
        model.addAttribute("posts", postService.findAll());
        return "allposts";
    }

    @GetMapping("/{id}/up")
    public String increase(@PathVariable(name = "id")long id) {
        Post post = postService.getMePostById(id);
        postService.upVote(post);
        postService.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/down")
    public String decrease(@PathVariable(name = "id")long id){
        Post post = postService.getMePostById(id);
        postService.downVote(post);
        postService.save(post);
        return "redirect:/posts";
    }
}