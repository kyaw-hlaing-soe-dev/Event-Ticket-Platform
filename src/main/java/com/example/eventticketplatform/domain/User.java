package com.example.eventticketplatform.domain;

import jakarta.persistence.Column;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "name" , nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

}
