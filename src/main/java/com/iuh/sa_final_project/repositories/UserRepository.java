package com.iuh.sa_final_project.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.iuh.sa_final_project.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByUsername(String mssv);
    
}
