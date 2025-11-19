package com.social_events_management_system.repositories.jpa;

import com.social_events_management_system.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventJpaRepository extends JpaRepository<Event, String> {
}
