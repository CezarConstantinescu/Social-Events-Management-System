package com.social_events_management_system.services.workflow;

import com.social_events_management_system.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    Event create(Event e);
    Optional<Event> findById(String id);
    List<Event> listAll();
    Event update(Event e);
    void delete(String id);
}
