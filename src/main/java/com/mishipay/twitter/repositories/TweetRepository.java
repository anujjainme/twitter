package com.mishipay.twitter.repositories;

import com.mishipay.twitter.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet,Long> {
    List<Tweet> findTweetsByUserId(Long userId);
}
