package org.example.exam_final.repository;


import com.votreNom.votrePrenom.gestioncredits.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
