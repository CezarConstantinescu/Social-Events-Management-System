package com.social_events_management_system.workflow;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.entities.Venue;
import com.social_events_management_system.services.implementation.workflow.EventServiceImpl;
import com.social_events_management_system.services.workflow.EventService;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class EventServiceWorkflowTest {
    private final EventService svc = new EventServiceImpl();

    @Test
    public void testCreateFindDelete() {
        Event e = new Event(null, "E", new Venue("v","n","a"), LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(1).plusHours(2));
        Event created = svc.create(e);
        assertNotNull(created.getId());

        assertTrue(svc.findById(created.getId()).isPresent());

        svc.delete(created.getId());
        assertFalse(svc.findById(created.getId()).isPresent());
    }
}
