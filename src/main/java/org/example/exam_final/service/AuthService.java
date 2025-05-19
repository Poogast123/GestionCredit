package org.example.exam_final.service;


import org.example.exam_final.dto.AuthRequest;
import org.example.exam_final.dto.AuthResponse;

public interface AuthService {
    AuthResponse authenticate(AuthRequest authRequest);
}

