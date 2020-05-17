package com.lokesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lokesh.User;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	private User user;
	
	@Autowired
	private UserServiceImpl userserviceimpl;
	
	@GetMapping
	public ResponseEntity<List<User>> getallusers(){
		List<User> userlist = userserviceimpl.getallusers();
		return new ResponseEntity<List<User>>(userlist,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<User> createuser(@RequestBody User user){
		userserviceimpl.save(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	
	
	
}
