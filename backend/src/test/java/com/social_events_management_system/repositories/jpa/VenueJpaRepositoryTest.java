package com.social_events_management_system.repositories.jpa;

import com.social_events_management_system.entities.Venue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class VenueJpaRepositoryTest {

    @Autowired
    private VenueJpaRepository venueJpa;

    @Test
    public void saveFindDeleteVenue() {
        Venue v = new Venue();
        v.setId("v1");
        v.setName("Hall");
        v.setAddress("Addr");

        venueJpa.save(v);

        assertTrue(venueJpa.findById("v1").isPresent());

        List<Venue> all = venueJpa.findAll();
        assertTrue(all.stream().anyMatch(x -> "v1".equals(x.getId())));

        venueJpa.deleteById("v1");
        assertFalse(venueJpa.findById("v1").isPresent());
    }
}
