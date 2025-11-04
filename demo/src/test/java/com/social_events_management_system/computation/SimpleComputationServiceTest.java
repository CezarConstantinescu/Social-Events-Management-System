package com.social_events_management_system.computation;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.entities.Venue;
import com.social_events_management_system.services.implementation.computation.SimpleComputationService;
import com.social_events_management_system.services.computation.ComputationResult;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class SimpleComputationServiceTest {
    private final SimpleComputationService svc = new SimpleComputationService();

    @Test
    public void testEstimate() {
        LocalDateTime s = LocalDateTime.now().plusDays(1);
        LocalDateTime e = s.plusHours(4);
        Event ev = new Event(null, "E", new Venue("v","n","a"), s, e);
        ComputationResult<Long> r = svc.computeAttendanceEstimate(ev);
        assertNotNull(r);
        assertTrue(r.getResult() >= 50L);
    }
}
