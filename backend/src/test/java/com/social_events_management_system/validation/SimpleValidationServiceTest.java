package com.social_events_management_system.validation;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.entities.Venue;
import com.social_events_management_system.services.implementation.validation.SimpleValidationService;
import com.social_events_management_system.services.validation.ValidationResult;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class SimpleValidationServiceTest {
    private final SimpleValidationService svc = new SimpleValidationService();

    @Test
    public void testValidEvent() {
        Event e = new Event(null, "Meetup", new Venue("v","Hall","addr"), LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(1).plusHours(2));
        ValidationResult r = svc.validateEvent(e);
        assertTrue(r.isValid());
    }

    @Test
    public void testMissingName() {
        Event e = new Event(null, "", new Venue("v","Hall","addr"), LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(1).plusHours(2));
        ValidationResult r = svc.validateEvent(e);
        assertFalse(r.isValid());
        assertNotNull(r.getMessage());
    }

    @Test
    public void testEndBeforeStart() {
        Event e = new Event(null, "E", new Venue("v","Hall","addr"), LocalDateTime.now().plusDays(2), LocalDateTime.now().plusDays(1));
        ValidationResult r = svc.validateEvent(e);
        assertFalse(r.isValid());
    }
}
