package com.qinxiandiqi.restonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String login(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleLogin(@RequestParam("username") String username, @RequestParam("password") String password){

		return "index";
	}
}