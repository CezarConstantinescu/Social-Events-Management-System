package com.social_events_management_system.repositories.jpa;

import com.social_events_management_system.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, String> {
}
