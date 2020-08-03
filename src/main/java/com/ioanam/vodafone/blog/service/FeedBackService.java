package com.ioanam.vodafone.blog.service;

import com.ioanam.vodafone.blog.entities.Feedback;
import com.ioanam.vodafone.blog.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackService {
    @Autowired
    FeedbackRepository feedbackRepository;

    public void saveOrUpdate(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    public void deleteById(int id) {
        feedbackRepository.deleteById(id);
    }

    public double getFeedbackByPost(int idPost) {
        List<Feedback> ratings = feedbackRepository.findAll();
        return ratings.stream()
                .filter(feedback -> feedback.getPost().getId() == idPost)
                .mapToInt(Feedback::getRating).average()
                .orElse(0);
    }
}
