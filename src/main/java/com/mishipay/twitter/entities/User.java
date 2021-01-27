package com.mishipay.twitter.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    public String getName() {
        return name;
    }

    private String name;
}
