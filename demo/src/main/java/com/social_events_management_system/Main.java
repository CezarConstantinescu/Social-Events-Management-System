package com.social_events_management_system;

import com.social_events_management_system.entities.Event;
import com.social_events_management_system.entities.Venue;
import com.social_events_management_system.entities.User;
import com.social_events_management_system.factory.EntityFactory;
import com.social_events_management_system.services.implementation.workflow.EventServiceImpl;
import com.social_events_management_system.services.implementation.workflow.UserServiceImpl;
import com.social_events_management_system.services.workflow.EventService;
import com.social_events_management_system.services.workflow.UserService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EventService eventService = new EventServiceImpl();
        UserService userService = new UserServiceImpl();

        Venue venue = EntityFactory.createVenue("Town Hall", "123 Main St");
        User user = EntityFactory.createUser("Alice", "alice@example.com");

        userService.create(user);

        LocalDateTime start = LocalDateTime.now().plusDays(7);
        LocalDateTime end = start.plusHours(3);
        Event event = EntityFactory.createEvent("Community Meetup", venue, start, end);

        eventService.create(event);

        System.out.println("Events:");
        eventService.listAll().forEach(System.out::println);

        System.out.println("Users:");
        userService.listAll().forEach(System.out::println);
    }
}
