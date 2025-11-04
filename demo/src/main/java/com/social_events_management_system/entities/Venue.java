package com.social_events_management_system.entities;

public class Venue {
    private String id;
    private String name;
    private String address;

    public Venue() {}

    public Venue(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Venue{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", address='" + address + '\'' + '}';
    }
}
