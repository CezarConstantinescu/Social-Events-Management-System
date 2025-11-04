package com.social_events_management_system.services.computation;

import com.social_events_management_system.entities.Event;

public interface ComputationService {
    ComputationResult<Long> computeAttendanceEstimate(Event e);
}
