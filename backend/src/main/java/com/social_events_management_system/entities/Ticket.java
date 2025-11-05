package com.social_events_management_system.entities;

public class Ticket {
    private String id;
    private String eventId;
    private String userId;
    private int quantity;

    public Ticket() {}

    public Ticket(String id, String eventId, String userId, int quantity) {
        this.id = id;
        this.eventId = eventId;
        this.userId = userId;
        this.quantity = quantity;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Ticket{" + "id='" + id + '\'' + ", eventId='" + eventId + '\'' + ", userId='" + userId + '\'' + ", quantity=" + quantity + '}';
    }
}
