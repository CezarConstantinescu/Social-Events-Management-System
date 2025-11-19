package com.social_events_management_system.repositories.jpa;

import com.social_events_management_system.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketJpaRepository extends JpaRepository<Ticket, String> {
}
