package com.social_events_management_system.repositories;

import com.social_events_management_system.entities.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User u);
    Optional<User> findById(String id);
    List<User> findAll();
    void delete(String id);
}
