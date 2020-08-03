package com.ioanam.vodafone.blog.service;

import com.ioanam.vodafone.blog.entities.Post;
import com.ioanam.vodafone.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {
    
    @Autowired
    PostRepository postRepository;
    
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public List<Post> getPostByIdUser(int idUser) {
        return getAllPosts().stream()
                .filter(post -> post.getId() == idUser)
                .collect(Collectors.toList());
    }

    public void saveOrUpdate(Post post) {
        postRepository.save(post);
    }

    public void deletePostById(Integer id) {
        postRepository.deleteById(id);
    }
}
