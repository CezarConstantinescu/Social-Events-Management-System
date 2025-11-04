package com.social_events_management_system.services.workflow;

import com.social_events_management_system.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User create(User u);
    Optional<User> findById(String id);
    List<User> listAll();
    User update(User u);
    void delete(String id);
}
