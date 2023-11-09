package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Disable CSRF protection as needed (be cautious with this)
                .csrf(AbstractHttpConfigurer::disable)
                // Configure authorization
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/**", "/error").permitAll() // Permit all requests to these endpoints
                        .anyRequest().authenticated() // Require authentication for any other request
                );
        // ... additional configurations, if any ...

        return http.build();
    }
}
