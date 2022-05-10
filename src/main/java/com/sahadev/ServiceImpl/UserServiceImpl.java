package com.sahadev.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sahadev.Repository.UserRepository;
import com.sahadev.Service.UserService;
import com.sahadev.entity.Roles;
import com.sahadev.entity.User;
@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) {
		
		Roles role=new Roles();
		if(user.getUserType().equals("admin")) {
			user.setActive("0");
			role.setRole("ROLE_ADMIN");
		}else if(user.getUserType().equals("job_provider")) {
				user.setActive("1");
				role.setRole("ROLE_EMPLOYEER");
			
		}else if(user.getUserType().equals("job_seeker")) {
			user.setActive("1");
			role.setRole("ROLE_USER");
		}
			
		role.setUser(user);
		user.setRole(role);
		
		return userRepo.save(user);
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		return userRepo.findById(userId);
	}

	@Override
	public void deleteUserById(Long userId) {
		if(userRepo.findById(userId).isPresent()) {
			userRepo.deleteById(userId);
	}

}
}