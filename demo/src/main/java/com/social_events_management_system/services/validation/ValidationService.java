package com.social_events_management_system.services.validation;

import com.social_events_management_system.entities.Event;

public interface ValidationService {
    ValidationResult validateEvent(Event e);
}
