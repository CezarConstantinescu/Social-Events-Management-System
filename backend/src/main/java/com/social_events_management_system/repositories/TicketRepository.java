package com.social_events_management_system.repositories;

import com.social_events_management_system.entities.Ticket;
import java.util.List;
import java.util.Optional;

public interface TicketRepository {
    Ticket save(Ticket t);
    Optional<Ticket> findById(String id);
    List<Ticket> findAll();
    void delete(String id);
}
