package com.codeclan.example.CC_w13d02_hw_files_folders.components;

import com.codeclan.example.CC_w13d02_hw_files_folders.models.File;
import com.codeclan.example.CC_w13d02_hw_files_folders.models.Folder;
import com.codeclan.example.CC_w13d02_hw_files_folders.models.User;
import com.codeclan.example.CC_w13d02_hw_files_folders.repositories.FileRepository;
import com.codeclan.example.CC_w13d02_hw_files_folders.repositories.FolderRepository;
import com.codeclan.example.CC_w13d02_hw_files_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user = new User("name");
        Folder folder1 = new Folder("title1", user);
        Folder folder2 = new Folder("title2", user);
        File file1 = new File("file1", ".txt", 32, folder1);
        File file2 = new File("file2", ".doc", 128, folder2);
        File file3 = new File("file3", ".rb", 256, folder2);

        userRepository.save(user);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);

    }



}
