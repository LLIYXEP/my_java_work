package com.example.demo.services;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repositorys.UserRepository;


@Service
public class UserService implements UserDetailsService{
	@Autowired
	private MailSender mailSender;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		
		if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
		
		return user;
	}
	
	public void saveRole(ArrayList<String> role, Integer age, Integer id, Map<String,String> allParams) {
		
		User user = userRepository.getById(id);
		
		if (role.size() > 0) {
			user.getRoles().clear();
		}
		
		for (String string : role) {
			if (string != null) {
				user.getRoles().add(Role.valueOf(string));
			}
		}	
		
		user.setFirstName(allParams.get("firstName"));
		user.setLastName(allParams.get("lastName"));
		if (allParams.get("password") == "") {
			user.setPassword(user.getPassword());
		} else {
			user.setPassword(passwordEncoder.encode(allParams.get("password")));
		}
		user.setEmail(allParams.get("email"));
		user.setAge(age);


        userRepository.save(user);
        
    }

	public void sendMessage(User user) {
		if (!StringUtils.isEmpty(user.getEmail())) {
			String message = String.format(
					"Hello, %s! \n" + "Welcome to My New Website. Please, visit next link  http://localhost:8080/activate/%s",
					user.getFirstName(), user.getActivationCode()
					);
			
			 mailSender.send(user.getEmail(), "Activation code", message);
		}
	}

	public boolean activateUser(String code) {
		
		User user = userRepository.findByActivationCode(code);
		
		if (user == null) {
			return false;
		}
		
		user.setActivationCode(null);
		user.setActive(true);
		
		userRepository.save(user);
		
		return true;
	}
	
}
