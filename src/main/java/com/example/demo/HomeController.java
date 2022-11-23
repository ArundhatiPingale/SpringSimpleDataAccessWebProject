package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String Home(HttpServletRequest req)
	{
  HttpSession session=req.getSession();
  String name=req.getParameter("name");
		System.out.println("Hi"+name);
		session.setAttribute("name", name);
		return "Welcome";
	}

}
