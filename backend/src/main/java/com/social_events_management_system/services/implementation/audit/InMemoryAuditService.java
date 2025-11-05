package com.social_events_management_system.services.implementation.audit;

import com.social_events_management_system.services.audit.AuditRecord;
import com.social_events_management_system.services.audit.AuditService;

import java.time.Instant;
import java.util.*;

public class InMemoryAuditService implements AuditService {
    private final Map<String, AuditRecord> store = new LinkedHashMap<>();

    @Override
    public void record(String action, String details) {
        String id = UUID.randomUUID().toString();
        AuditRecord r = new AuditRecord(id, action, details, Instant.now());
        store.put(id, r);
    }

    @Override
    public List<AuditRecord> listAll() {
        return new ArrayList<>(store.values());
    }
}
