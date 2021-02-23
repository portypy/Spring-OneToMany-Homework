package com.codeclan.example.RelationshipHomework.repositories;

import com.codeclan.example.RelationshipHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
