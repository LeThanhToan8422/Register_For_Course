package com.iuh.sa_final_project.config;

import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.iuh.sa_final_project.services.JpaUserDetalsService;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    private JpaUserDetalsService jpaUserDetalsService;
    
    public SecurityConfig(JpaUserDetalsService jpaUserDetalsService) {
        this.jpaUserDetalsService = jpaUserDetalsService;
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            // .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
            .authorizeRequests(auth -> auth
                .requestMatchers("/ttt").permitAll()
                .anyRequest().authenticated()
            )
            .userDetailsService(jpaUserDetalsService)
            // .headers(header -> header
            //     .frameOptions().sameOrigin()
            // )
            // .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults())
        .build();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
