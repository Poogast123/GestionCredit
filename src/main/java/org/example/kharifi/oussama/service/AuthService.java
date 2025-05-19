package org.example.kharifi.oussama.service;


import org.example.kharifi.oussama.dto.AuthRequest;
import org.example.kharifi.oussama.dto.AuthResponse;

public interface AuthService {
    AuthResponse authenticate(AuthRequest authRequest);
}

