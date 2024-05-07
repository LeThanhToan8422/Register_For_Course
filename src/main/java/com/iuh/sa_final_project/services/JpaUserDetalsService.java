package com.iuh.sa_final_project.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iuh.sa_final_project.models.UserSecurity;
import com.iuh.sa_final_project.repositories.UserRepository;

@Service
public class JpaUserDetalsService implements UserDetailsService{

    private final UserRepository userRepository;

    public JpaUserDetalsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
        .map(UserSecurity::new)
        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
    
}
