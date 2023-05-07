package com.hoxify.springreactBackend.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/api/1.0/users")
	public void createUser(@RequestBody User user) {
		log.info(user.toString());
	}
	
}
