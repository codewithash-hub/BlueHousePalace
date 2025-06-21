package com.restaurant.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GenerateValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;

    @Column(unique = true)
	private String email;

	private String password;
    private String role = "ROLE_USER";
	
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