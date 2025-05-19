package org.example.exam_final.entity;

package com.votreNom.votrePrenom.gestioncredits.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    private String role;  // Exemple : USER, ADMIN

    // Getters & setters
}

