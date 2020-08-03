package com.ioanam.vodafone.blog.controller;

import com.ioanam.vodafone.blog.entities.Feedback;
import com.ioanam.vodafone.blog.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class FeedbackController {
    @Autowired
    FeedBackService feedBackService;
    
    @PostMapping("/feedback")
    public void saveFeedback(@RequestBody Feedback feedback) {
        feedBackService.saveOrUpdate(feedback);
    }

    @GetMapping("/feedback/{id_post}")
    public double getFeedbackByPost(@PathVariable("id_post") Integer idPost) {
        return feedBackService.getFeedbackByPost(idPost);
    }

    @DeleteMapping("/delete-feedback/{id}")
    public void deleteFeedback(@PathVariable("id") Integer id) {
        feedBackService.deleteById(id);
    }
}
