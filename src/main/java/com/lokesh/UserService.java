package com.lokesh;

import java.util.List;

public interface UserService {
	
	public boolean save(User user);
	public boolean delete(User user);
	public List<User> getallusers();


}
