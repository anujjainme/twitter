package com.mishipay.twitter.services;

import com.mishipay.twitter.entities.User;
import com.mishipay.twitter.repositories.FollowRepository;
import com.mishipay.twitter.repositories.TweetRepository;
import com.mishipay.twitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FollowRepository followRepository;

    @Autowired
    private TweetRepository tweetRepository;

    public List<User> list() {
        return userRepository.findAll();
    }

    public List<String> getFollowers(long id) {
        List<Long> userIds = followRepository.findByUserId(id).stream()
                .map(f->f.getFollowedBy())
                .collect(Collectors.toList());
        return userRepository.findByIds(userIds);
    }

    public List<String> getTweets(long id) {
        return tweetRepository.findTweetsByUserId(id).stream().map(t->t.getTweet()).collect(Collectors.toList());
    }
}
