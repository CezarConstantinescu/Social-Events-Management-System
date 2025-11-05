package com.social_events_management_system.services.implementation.workflow;

import com.social_events_management_system.entities.User;
import com.social_events_management_system.services.workflow.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {
    private final Map<String, User> store = new HashMap<>();

    @Override
    public User create(User u) {
        if (u.getId() == null) u.setId(UUID.randomUUID().toString());
        store.put(u.getId(), u);
        return u;
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public java.util.List<User> listAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public User update(User u) {
        store.put(u.getId(), u);
        return u;
    }

    @Override
    public void delete(String id) {
        store.remove(id);
    }
}
