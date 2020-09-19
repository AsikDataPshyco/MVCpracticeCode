 package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class tradeController {
	@RequestMapping("/trades")
	//@ResponseBody
	public String trades(HttpServletRequest req)
	{
		HttpSession session = req.getSession();		
		String tname = req.getParameter("tname");
		session.setAttribute("tname", tname);
		//System.out.println("Welcome to Trade Review");				
		return "trades.jsp";
	
	}

}
