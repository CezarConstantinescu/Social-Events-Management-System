package com.social_events_management_system.services.implementation.workflow;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.services.workflow.EventService;

import java.util.*;

public class EventServiceImpl implements EventService {
    private final Map<String, Event> store = new HashMap<>();

    @Override
    public Event create(Event e) {
        if (e.getId() == null) e.setId(UUID.randomUUID().toString());
        store.put(e.getId(), e);
        return e;
    }

    @Override
    public Optional<Event> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Event> listAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Event update(Event e) {
        store.put(e.getId(), e);
        return e;
    }

    @Override
    public void delete(String id) {
        store.remove(id);
    }
}
