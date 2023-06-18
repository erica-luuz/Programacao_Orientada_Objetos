package com.programando.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/login")
public class LoginApplication {

	@GetMapping("/{user}")
	public String loginUser(@PathVariable String user){
		if (user.equals("admin")) {
			return "true";
		}else {
			return "false";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
