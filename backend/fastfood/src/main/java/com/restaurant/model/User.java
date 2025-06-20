package com.restaurant.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;

@Entity
public class User {
	@Id
	@GenerateValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String password;
	
	// Getters and Setters
    public Long getId() {
    	return id;
    }
    public void setId(Long id) {
    	this.id = id;
    }
    
    public String getUsername() {
    	return username;
    }
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public String getPassword() {
    	return password;
    }
    public void setPasseord(String password) {
    	this.password = password;
    }
}