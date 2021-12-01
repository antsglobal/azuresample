package com.alpha;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.alpha.model.UserDetails;
//import com.alpha.model.UserLoginModel;
//import com.alpha.repository.UserRepository;

@RestController(value = "/")
public class HomeController {
	
//	@Autowired
//	UserRepository userRepository;
//	
	@Autowired
	MyAppBean appBean;
	
	@GetMapping("/index")
	public String index() {
		//appBean.getMessage()
	return "welcome to Index API version 0.0.2";	
	}
	@GetMapping("/home")
	public String home() {
	return "welcome to Home API";	
	}
	
	@GetMapping("/hello")
	public String hello() {
	return "This is Hello API";	
	}
	
//	@PostMapping("/login")
//	public Optional<UserDetails> userDetails(@RequestBody UserLoginModel userLoginModel) {
//		return userRepository.getUserDetailsBasedOnEmail(userLoginModel.getUserEmail());	
//	}
	
	}
