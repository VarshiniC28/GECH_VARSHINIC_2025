package com.varshini.journalapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.varshini.journalapp.models.User;
import com.varshini.journalapp.repository.UserRepository;

@Service // Marks the class as a service component to be managed by Spring container
public class UserDetailsServiceImpl implements UserDetailsService{ // inbuilt interface UserDetailsService implemented by our class to override its following method which is required to our method

	@Autowired // Injects the UserRepository dependency to fetch user data from DB
	private UserRepository userRepository;
	
	@Override // Overrides the loadUserByUsername method from UserDetailsService
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username); // Fetches user from DB by username
		if(user!=null) {
			return org.springframework.security.core.userdetails.User.builder() // Starts building a Spring Security user
				.username(user.getUsername()) // Sets the username
				.password(user.getPassword()) // Sets the password (usually encrypted)
				.roles(user.getRoles().toArray(new String[0]))  // Converts user's list of roles to a array of strings because .roles() needs an array, not a list.
				.build(); // Builds the UserDetails object if and only user is found else throw execption as below
		}
		throw new UsernameNotFoundException("User not found with this username: "+username);
	}

}
