package com.mishipay.twitter.entities;

import javax.persistence.*;

@Entity
@Table(name="tweet")
public class Tweet {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user")
    private Long userId;
    private String tweet;
}
