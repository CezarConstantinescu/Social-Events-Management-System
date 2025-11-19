package com.social_events_management_system.repositories.jpa;

import com.social_events_management_system.entities.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueJpaRepository extends JpaRepository<Venue, String> {
}
