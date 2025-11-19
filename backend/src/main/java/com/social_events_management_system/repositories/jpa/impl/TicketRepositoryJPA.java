package com.social_events_management_system.repositories.jpa.impl;

import com.social_events_management_system.entities.Ticket;
import com.social_events_management_system.repositories.TicketRepository;
import com.social_events_management_system.repositories.jpa.TicketJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TicketRepositoryJPA implements TicketRepository {

    @Autowired
    private TicketJpaRepository jpa;

    @Override
    public Ticket save(Ticket t) {
        return jpa.save(t);
    }

    @Override
    public Optional<Ticket> findById(String id) {
        return jpa.findById(id);
    }

    @Override
    public List<Ticket> findAll() {
        return jpa.findAll();
    }

    @Override
    public void delete(String id) {
        jpa.deleteById(id);
    }
}
