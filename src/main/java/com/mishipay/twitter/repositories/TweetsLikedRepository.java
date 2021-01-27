package com.mishipay.twitter.repositories;

import com.mishipay.twitter.entities.TweetsLiked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetsLikedRepository extends JpaRepository<TweetsLiked, Long> {
//    List<TweetsLiked> findByTweetId(Long tweetId);
}
