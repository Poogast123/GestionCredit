package org.example.exam_final.service;


import org.example.exam_final.dto.AuthRequest;
import org.example.exam_final.dto.AuthResponse;
import org.example.exam_final.security.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public AuthResponse authenticate(AuthRequest authRequest) {
        try {
            // On authentifie l'utilisateur avec Spring Security
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
            );

            // Si authentification OK, on génère le token JWT
            String token = jwtUtil.generateToken(authRequest.getUsername());

            return new AuthResponse(token);
        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid username/password");
        }
    }
}
