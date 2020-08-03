package com.ioanam.vodafone.blog.repository;

import com.ioanam.vodafone.blog.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
}
