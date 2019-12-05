package com.scurtu.scool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.scurtu.scool.domain.User;
import com.scurtu.scool.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String password) throws UsernameNotFoundException {
		User user = userRepository.findByPassword(password);

		if (user == null) {
            throw new UsernameNotFoundException("User not found.");
        }
		
		
		return user;
	}
	
	

}
