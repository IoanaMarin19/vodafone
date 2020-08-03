package com.ioanam.vodafone.blog.controller;

import com.ioanam.vodafone.blog.entities.Post;
import com.ioanam.vodafone.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class PostController {
    @Autowired
    PostService postService;
    
    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @DeleteMapping("/delete-post/{id}")
    public void deletePost(@PathVariable("id") Integer id) {
        postService.deletePostById(id);
    }

    @PostMapping("/post")
    public void savePost(@RequestBody Post post) {
        postService.saveOrUpdate(post);
    }

    @GetMapping("/posts/{id_user}")
    public List<Post> getPostByUserId(@PathVariable("userId") Integer userId) {
        return postService.getPostByIdUser(userId);
    }
}
