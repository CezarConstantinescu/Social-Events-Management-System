package com.social_events_management_system.repositories.jpa.impl;

import com.social_events_management_system.entities.User;
import com.social_events_management_system.repositories.UserRepository;
import com.social_events_management_system.repositories.jpa.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryJPA implements UserRepository {

    @Autowired
    private UserJpaRepository jpa;

    @Override
    public User save(User u) {
        return jpa.save(u);
    }

    @Override
    public Optional<User> findById(String id) {
        return jpa.findById(id);
    }

    @Override
    public List<User> findAll() {
        return jpa.findAll();
    }

    @Override
    public void delete(String id) {
        jpa.deleteById(id);
    }
}
