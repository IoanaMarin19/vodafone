package com.ioanam.vodafone.blog.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "feedback")
public class Feedback implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column
    private int rating;
    
    @ManyToOne
    @JoinColumn(name="id_post")
    private Post post;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
