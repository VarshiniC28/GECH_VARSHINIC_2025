package com.springSecurityDemo.springSecurityDemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfiguration {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetaillsService(){
		//This inMemory authentication 
		UserDetails user1 = User.withUsername("ammu")
			.password(passwordEncoder().encode("ammu@28"))
			.roles("ADMIN")
			.build();
		
		UserDetails user2 = User.withUsername("sanjay")
				.password(passwordEncoder().encode("sanjay@20"))
				.roles("USER")
				.build();
		
		return new InMemoryUserDetailsManager(user1, user2); //noargs contructor in Userdetails package which will create and store UserDetails Objects
	}
}
