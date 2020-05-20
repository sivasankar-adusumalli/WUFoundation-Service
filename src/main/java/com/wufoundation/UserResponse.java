package com.wufoundation;

import org.springframework.stereotype.Component;

@Component("userResponse")
public class UserResponse {

	
	private String name;
	private String email;
	private String card;
	
	private UserResponse() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
}
