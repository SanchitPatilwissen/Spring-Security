package com.example.demo.config;

import java.beans.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		http.csrf(customizer -> customizer.disable());
		http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
		http.formLogin(Customizer.withDefaults());
		
		return http.build();
	}
}
