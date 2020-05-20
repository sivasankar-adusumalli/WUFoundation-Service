package com.wufoundation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
@CrossOrigin(origins = "*")
public class WuFoundationServiceApplication {

	@Autowired
	private UserResponse userResponse;
	
	@PostMapping("/donate")  
	public UserResponse donateUser(@RequestBody User user)  
	{  
		
		System.out.println("*********Request Details From Angular***********");
		System.out.println("Name       	:"+ user.getFirst());
		System.out.println("last       	:"+ user.getLast());
		System.out.println("Address    	:"+ user.getAddress());
		System.out.println("City       	:"+ user.getCity());
		System.out.println("State      	:"+ user.getState());
		System.out.println("Country    	:"+ user.getCountry());
		System.out.println("ZIP        	:"+ user.getZip());
		System.out.println("Email      	:"+ user.getEmail());
		System.out.println("Phone      	:"+ user.getPhone());
		System.out.println("Designation	:"+ user.getDesignation());
		System.out.println("Amount     	:"+ user.getAmount());
		//System.out.println("OtherAmount	:"+ user.getOtherAmount());
		System.out.println("Card Number	:"+ user.getCardNumber());
		System.out.println("ExpiryMonth	:"+ user.getExpiryMonth());
		System.out.println("Expiry Year	:"+ user.getExpiryYear());
		System.out.println("CVV        	:"+ user.getCvv());
		System.out.println("***************************************************");
		
		
		//UserResponse userResponse = new UserResponse();
		userResponse.setName(user.getFirst()+user.getLast());
		userResponse.setEmail("test@gmail.com");
		userResponse.setCard("XXXXXXXXX");
		
	return  userResponse;  
	}  
	public static void main(String[] args) {
		SpringApplication.run(WuFoundationServiceApplication.class, args);
	}

}
