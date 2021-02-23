package com.codeclan.example.RelationshipHomework.components;


import com.codeclan.example.RelationshipHomework.models.File;
import com.codeclan.example.RelationshipHomework.models.Folder;
import com.codeclan.example.RelationshipHomework.models.User;
import com.codeclan.example.RelationshipHomework.repositories.FileRepository;
import com.codeclan.example.RelationshipHomework.repositories.FolderRepository;
import com.codeclan.example.RelationshipHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        User user = new User("Bob");
        userRepository.save(user);
        Folder folder = new Folder("PDA", user);
        folderRepository.save(folder);
        File file = new File("Algorithms",".txt", 123 , folder);
        fileRepository.save(file);
    }

}
