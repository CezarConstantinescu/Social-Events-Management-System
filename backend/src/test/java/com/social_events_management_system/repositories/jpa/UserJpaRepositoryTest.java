package com.social_events_management_system.repositories.jpa;

import com.social_events_management_system.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserJpaRepositoryTest {

    @Autowired
    private UserJpaRepository userJpa;

    @Test
    public void saveFindDeleteUser() {
        User u = new User();
        u.setId("u1");
        u.setName("Alice");
        u.setEmail("a@example.com");

        userJpa.save(u);

        assertTrue(userJpa.findById("u1").isPresent());

        List<User> all = userJpa.findAll();
        assertTrue(all.stream().anyMatch(x -> "u1".equals(x.getId())));

        userJpa.deleteById("u1");
        assertFalse(userJpa.findById("u1").isPresent());
    }
}
