package com.social_events_management_system.factory;

import com.social_events_management_system.entities.*;

import java.time.LocalDateTime;
import java.util.UUID;

public final class EntityFactory {
    private EntityFactory() {}

    public static Event createEvent(String name, Venue venue, LocalDateTime start, LocalDateTime end) {
        return new Event(UUID.randomUUID().toString(), name, venue, start, end);
    }

    public static User createUser(String name, String email) {
        return new User(UUID.randomUUID().toString(), name, email);
    }

    public static Venue createVenue(String name, String address) {
        return new Venue(UUID.randomUUID().toString(), name, address);
    }

    public static Ticket createTicket(String eventId, String userId, int quantity) {
        return new Ticket(UUID.randomUUID().toString(), eventId, userId, quantity);
    }
}
