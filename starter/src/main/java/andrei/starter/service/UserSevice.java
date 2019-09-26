package andrei.starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import andrei.starter.repos.UserRepo;

@Service
public class UserSevice implements UserDetailsService {
	@Autowired
	private UserRepo userRepo;
//	private final UserRepo userRepo;
//	
//	public UserSevice(UserRepo userRepo) {
//		this.userRepo = userRepo;
//	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userRepo.findByUsername(username);
	}
	
}
