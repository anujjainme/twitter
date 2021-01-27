package com.mishipay.twitter.entities;

import javax.persistence.*;

@Entity
@Table(name="tweets_liked")
public class TweetsLiked {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name ="tweet_id")
    private Long tweetId;
    @Column(name ="user_id")
    private Long userId;
}
