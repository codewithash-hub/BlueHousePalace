package com.restaurant.model;

import jakarta.persistence.*;

@Entity
public class MenuItem {

    @Id
    @GenerateValue(strategy = GenerateType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    // Getters and Setters
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public double getPrice() {
    	return price;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
}

@Entity
public class User {
	@Id
	@GenerateValue(strategy = GenerateType.IDENTITY)
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


@Entity
public class CartItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MenuItem menuItem;
    private int quantity;

    @ManyToOne
    private User user;
}




