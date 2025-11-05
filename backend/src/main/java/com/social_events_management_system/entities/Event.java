package com.social_events_management_system.entities;

import java.time.LocalDateTime;

public class Event {
    private String id;
    private String name;
    private Venue venue;
    private LocalDateTime start;
    private LocalDateTime end;

    public Event() {}

    public Event(String id, String name, Venue venue, LocalDateTime start, LocalDateTime end) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.start = start;
        this.end = end;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Venue getVenue() { return venue; }
    public void setVenue(Venue venue) { this.venue = venue; }
    public LocalDateTime getStart() { return start; }
    public void setStart(LocalDateTime start) { this.start = start; }
    public LocalDateTime getEnd() { return end; }
    public void setEnd(LocalDateTime end) { this.end = end; }

    @Override
    public String toString() {
        return "Event{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", venue=" + venue + ", start=" + start + ", end=" + end + '}';
    }
}
