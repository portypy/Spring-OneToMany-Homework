package com.codeclan.example.RelationshipHomework.repositories;

import com.codeclan.example.RelationshipHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
