package com.codeclan.example.CC_w13d02_hw_files_folders.repositories;

import com.codeclan.example.CC_w13d02_hw_files_folders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
}
