package com.example.schoolERP.project.service;

import com.example.schoolERP.project.model.User;
import com.example.schoolERP.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

	@Override
	public boolean authenticate(String username, String password) {
		return false;
	}
}
