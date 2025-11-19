package com.social_events_management_system.repositories.jpa;

import com.social_events_management_system.entities.Ticket;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class TicketJpaRepositoryTest {

    @Autowired
    private TicketJpaRepository ticketJpa;

    @Test
    public void saveFindDeleteTicket() {
        Ticket t = new Ticket();
        t.setId("t1");
        t.setEventId("e1");
        t.setUserId("u1");
        t.setQuantity(2);

        ticketJpa.save(t);

        assertTrue(ticketJpa.findById("t1").isPresent());

        List<Ticket> all = ticketJpa.findAll();
        assertTrue(all.stream().anyMatch(x -> "t1".equals(x.getId())));

        ticketJpa.deleteById("t1");
        assertFalse(ticketJpa.findById("t1").isPresent());
    }
}
