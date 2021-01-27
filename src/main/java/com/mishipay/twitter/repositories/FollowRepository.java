package com.mishipay.twitter.repositories;

import com.mishipay.twitter.entities.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowRepository extends JpaRepository<Follow,Long> {
     List<Follow> findByUserId(Long userId);
}
