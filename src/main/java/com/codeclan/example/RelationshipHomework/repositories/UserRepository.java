package com.codeclan.example.RelationshipHomework.repositories;

import com.codeclan.example.RelationshipHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
