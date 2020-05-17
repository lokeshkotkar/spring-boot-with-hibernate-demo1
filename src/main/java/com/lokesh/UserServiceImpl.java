package com.lokesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	public UserRepository userrepository;

	@Override
	public boolean save(User user) {
		userrepository.save(user);
		return true;
	}

	@Override
	public boolean delete(User user) {
		return false;
	}

	@Override
	public List<User> getallusers() {
		List<User> userlist = (List<User>) userrepository.findAll();
		return userlist;
	}

	
	
	
}
