package com.mishipay.twitter.entities;

import javax.persistence.*;

@Entity
@Table(name="tweet")
public class Tweet {
    @Id
    @GeneratedValue
    private Long id;

    public Long getUserId() {
        return userId;
    }

    public String getTweet() {
        return tweet;
    }

    @Column(name = "user_id")
    private Long userId;
    private String tweet;
}
