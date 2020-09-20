 package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller

//pass the client data using http session
/*public class tradeController {
	@RequestMapping("/trades")
	//@ResponseBody
	public String trades(HttpServletRequest req)
	{
		HttpSession session = req.getSession();		
		String tname = req.getParameter("tname");
		session.setAttribute("tname", tname);
		//System.out.println("Welcome to Trade Review");				
		return "trades.jsp";
	
	}*/
//pass the client data without using https
	public class tradeController {
		@RequestMapping("/trades")
		//@ResponseBody
		public ModelAndView trades(@RequestParam("tname")String tnames)
		{
		    ModelAndView mv = new ModelAndView();
		    mv.addObject("tname",tnames);
		    mv.setViewName("trades.jsp");							
			return mv;
		
		}

}
