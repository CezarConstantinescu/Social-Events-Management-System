package com.social_events_management_system.services.audit;

import java.util.List;

public interface AuditService {
    void record(String action, String details);
    List<AuditRecord> listAll();
}
