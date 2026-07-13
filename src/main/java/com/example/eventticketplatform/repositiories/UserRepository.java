package com.example.eventticketplatform.repositiories;

import com.example.eventticketplatform.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
