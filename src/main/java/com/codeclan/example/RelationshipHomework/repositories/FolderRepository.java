package com.codeclan.example.RelationshipHomework.repositories;

import com.codeclan.example.RelationshipHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
