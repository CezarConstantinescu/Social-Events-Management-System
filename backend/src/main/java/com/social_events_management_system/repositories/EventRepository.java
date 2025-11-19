package com.social_events_management_system.repositories;

import com.social_events_management_system.entities.Event;
import java.util.List;
import java.util.Optional;

public interface EventRepository {
    Event save(Event e);
    Optional<Event> findById(String id);
    List<Event> findAll();
    void delete(String id);
}
