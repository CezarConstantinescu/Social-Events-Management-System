package com.social_events_management_system.services.validation;

public class ValidationResult {
    private final boolean valid;
    private final String message;

    public ValidationResult(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    public boolean isValid() { return valid; }
    public String getMessage() { return message; }

    public static ValidationResult ok() { return new ValidationResult(true, "OK"); }
    public static ValidationResult fail(String msg) { return new ValidationResult(false, msg); }
}
