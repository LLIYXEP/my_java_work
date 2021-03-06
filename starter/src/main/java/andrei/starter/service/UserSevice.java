package andrei.starter.service;

import java.util.Collections;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import andrei.starter.domain.Role;
import andrei.starter.domain.User;
import andrei.starter.repos.UserRepo;

@Service
public class UserSevice implements UserDetailsService {
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private MailSender mailSender;
//	private final UserRepo userRepo;
//	
//	public UserSevice(UserRepo userRepo) {
//		this.userRepo = userRepo;
//	}
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepo.findByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		return user;
	}
	
	public boolean addUser(User user) {
		User userFromDb = userRepo.findByUsername(user.getUsername());
		
		if (userFromDb != null) {
			return false;
		}
		
		user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        user.setActivationCode(UUID.randomUUID().toString());
        userRepo.save(user);
        
        if (!StringUtils.isEmpty(user.getEmail())) {
        	String message = String.format(
        			"Hello, %s! \n" +
        	"Welcome to Sweater. Please, visit next link: http://localhost:8080/activate/%s",
        	user.getUsername(),
        	user.getActivationCode()
        			);
        	
        	mailSender.send(user.getEmail(), "Activation code", message);
		}
        
        return true;
	}
	
	public boolean activateUser(String code) {
		
		
		User user = userRepo.findByActivationCode(code);
		
		if (user == null) {
			return false;
		}
		
		user.setActivationCode(null);
		userRepo.save(user);
		
		return true;
	}
	
}
