package com.social_events_management_system.services.audit;

import java.time.Instant;

public class AuditRecord {
    private final String id;
    private final String action;
    private final String details;
    private final Instant when;

    public AuditRecord(String id, String action, String details, Instant when) {
        this.id = id;
        this.action = action;
        this.details = details;
        this.when = when;
    }

    public String getId() { return id; }
    public String getAction() { return action; }
    public String getDetails() { return details; }
    public Instant getWhen() { return when; }
}
