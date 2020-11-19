package com.example.flight_reservation.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.flight_reservation.entities.Users;
import com.example.flight_reservation.repositories.UsersRepository;

@Controller
public class UsersControllers {

	@Autowired
	UsersRepository usersRepo;
	
	//add tomcat jasper in pom.xml ( download from maven ) before running .
	
	
	// to get sign up page
	@RequestMapping("/signUpPage")
	public String signUpPage() {
		return "user/signUp";
	}
	
	// sign up new user 
	@RequestMapping("/signUpUser")
	public String signUpUser(@Valid @ModelAttribute("user") Users user , ModelMap modelMap) {
		Users userExist = usersRepo.findByEmail(user.getEmail());
		if(userExist != null) {
			modelMap.addAttribute("signUpMsg","Already registered. Try another email");
			return "user/signUp";
		}else {
			usersRepo.save(user);
			return "user/login";
		}
		
	}
	
	
	// to get login page
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "user/login";
	}
	
	// to verify user email and password
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email , @RequestParam("password") String password , ModelMap modelMap )
	{
		Users userExist = usersRepo.findByEmail(email);
		if (userExist != null) {
			if (userExist.getPassword().equals(password)) {
				return "flight/searchFlights";
			} else {
				modelMap.addAttribute("loginMsg", "Invalid Credentials");
				return "user/login";
			}
		} else {
			modelMap.addAttribute("loginMsg", "Invalid Credentials");
			return "user/login";
		}

	}
	
}
