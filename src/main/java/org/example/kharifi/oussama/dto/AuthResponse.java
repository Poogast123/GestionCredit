package org.example.kharifi.oussama.dto;

package com.votreNom.votrePrenom.gestioncredits.dto;

public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
