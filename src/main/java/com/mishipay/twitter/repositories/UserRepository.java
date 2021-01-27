package com.mishipay.twitter.repositories;

import com.mishipay.twitter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query( "select name from User where id in :ids" )
    List<String> findByIds(@Param("ids") List<Long> ids);
}
