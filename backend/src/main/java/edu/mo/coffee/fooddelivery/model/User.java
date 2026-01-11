package edu.mo.coffee.fooddelivery.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(nullable = false)
    private String fullName;

    @Column(unique = true)
    private String email;

    @Column(unique = true, nullable = false)
    private String phone;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private String address;

    @Column(updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    private String image;
}

enum UserRole {
    CUSTOMER, MERCHANT, SHIPPER
}
