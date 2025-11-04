package com.social_events_management_system.services.implementation.validation;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.services.validation.ValidationResult;
import com.social_events_management_system.services.validation.ValidationService;

public class SimpleValidationService implements ValidationService {
    @Override
    public ValidationResult validateEvent(Event e) {
        if (e == null) return ValidationResult.fail("Event is null");
        if (e.getName() == null || e.getName().trim().isEmpty()) return ValidationResult.fail("name required");
        if (e.getStart() == null || e.getEnd() == null) return ValidationResult.fail("start/end required");
        if (!e.getEnd().isAfter(e.getStart())) return ValidationResult.fail("end must be after start");
        return ValidationResult.ok();
    }
}
