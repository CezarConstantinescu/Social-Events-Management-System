package com.social_events_management_system.repositories.jpa;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.entities.Venue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class EventJpaRepositoryTest {

    @Autowired
    private EventJpaRepository eventJpa;

    @Autowired
    private VenueJpaRepository venueJpa;

    @Test
    public void saveFindDeleteEvent() {
        Venue v = new Venue();
        v.setId("v1");
        v.setName("Hall");
        v.setAddress("Addr");
        venueJpa.save(v);

        Event e = new Event();
        e.setId("e1");
        e.setName("Test Event");
        e.setVenue(v);
        e.setStart(LocalDateTime.now().plusDays(1));
        e.setEnd(LocalDateTime.now().plusDays(1).plusHours(2));

        Event saved = eventJpa.save(e);
        assertNotNull(saved);
        assertEquals("e1", saved.getId());

        assertTrue(eventJpa.findById("e1").isPresent());

        assertFalse(eventJpa.findById("nope").isPresent());

        eventJpa.deleteById("e1");
        assertFalse(eventJpa.findById("e1").isPresent());
    }
}
