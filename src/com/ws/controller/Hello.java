package com.ws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ws.service.UserService;

@Controller
public class Hello {

	public String s;
	
	//  �Զ�ע��
	@Autowired
	private UserService userService;

	//��¼����
	@RequestMapping(value="/hello")
      public ModelAndView hello(String username,String password){
          s="1234588";
          s=userService.login(username, password).toString();
          
          System.out.println(s+"-----");
          return new ModelAndView("MyJsp","s",s);
      }
	
}
