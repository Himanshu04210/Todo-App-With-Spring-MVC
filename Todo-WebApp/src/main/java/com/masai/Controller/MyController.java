package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.masai.Utils.EMUtils;
import com.masai.entity.Users;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {
	
	@Autowired
	private EMUtils emUtils;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	
	public String reegisterUserHandler(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String mobileNo = request.getParameter("mobileNo");
		
		Users user = new Users();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobileNo(mobileNo);
		
		
		
		return "create-todo";
	}
}
