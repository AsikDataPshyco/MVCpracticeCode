 package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class tradeController {
	@RequestMapping("/trades")
	@ResponseBody
	public String trades()
	{
		//System.out.println("Welcome to Trade Review");				
		return "trades.jsp";
	
	}

}
