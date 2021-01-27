package com.mishipay.twitter.entities;

import javax.persistence.*;

@Entity
@Table(name="follow")
public class Follow {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "followed_by")
    private Long followedBy;

    public Long getUserId() {
        return userId;
    }

    public Long getFollowedBy() {
        return followedBy;
    }
}
