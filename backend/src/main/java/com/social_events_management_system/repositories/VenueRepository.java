package com.social_events_management_system.repositories;

import com.social_events_management_system.entities.Venue;
import java.util.List;
import java.util.Optional;

public interface VenueRepository {
    Venue save(Venue v);
    Optional<Venue> findById(String id);
    List<Venue> findAll();
    void delete(String id);
}
