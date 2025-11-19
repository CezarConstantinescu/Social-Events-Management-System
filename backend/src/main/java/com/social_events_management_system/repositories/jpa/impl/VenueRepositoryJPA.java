package com.social_events_management_system.repositories.jpa.impl;

import com.social_events_management_system.entities.Venue;
import com.social_events_management_system.repositories.VenueRepository;
import com.social_events_management_system.repositories.jpa.VenueJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VenueRepositoryJPA implements VenueRepository {

    @Autowired
    private VenueJpaRepository jpa;

    @Override
    public Venue save(Venue v) {
        return jpa.save(v);
    }

    @Override
    public Optional<Venue> findById(String id) {
        return jpa.findById(id);
    }

    @Override
    public List<Venue> findAll() {
        return jpa.findAll();
    }

    @Override
    public void delete(String id) {
        jpa.deleteById(id);
    }
}
