package com.appsoft.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsoft.models.User;
import com.appsoft.repository.UserRepository;
import com.appsoft.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User register(User user) {

		return this.userRepository.save(user);
	}

	@Override
	public boolean login(String name, String password) {
		
		return this.userRepository.existsByNameAndPassword( name, password);
	}

	@Override
	public boolean isUserWithSameNameExists(String name) {

		return this.userRepository.existsByName(name);
	}

}
