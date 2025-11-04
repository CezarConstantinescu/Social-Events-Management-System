package com.social_events_management_system.services.implementation.computation;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.services.computation.ComputationResult;
import com.social_events_management_system.services.computation.ComputationService;

public class SimpleComputationService implements ComputationService {
    @Override
    public ComputationResult<Long> computeAttendanceEstimate(Event e) {
        // Very naive stub: estimate 50 people per hour of event
        long hours = java.time.Duration.between(e.getStart(), e.getEnd()).toHours();
        long estimate = Math.max(1, hours) * 50;
        return new ComputationResult<>(estimate);
    }
}
