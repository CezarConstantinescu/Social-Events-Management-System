package com.social_events_management_system.repositories.jpa.impl;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.repositories.EventRepository;
import com.social_events_management_system.repositories.jpa.EventJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EventRepositoryJPA implements EventRepository {

    @Autowired
    private EventJpaRepository jpa;

    @Override
    public Event save(Event e) {
        return jpa.save(e);
    }

    @Override
    public Optional<Event> findById(String id) {
        return jpa.findById(id);
    }

    @Override
    public List<Event> findAll() {
        return jpa.findAll();
    }

    @Override
    public void delete(String id) {
        jpa.deleteById(id);
    }
}
