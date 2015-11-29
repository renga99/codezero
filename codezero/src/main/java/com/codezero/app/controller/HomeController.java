package com.codezero.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codezero.app.service.WebpageService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
		@Autowired
		private WebpageService homeService;
	
	  	@RequestMapping("/getURL")
	    public @ResponseBody String getURL(String url) {
	        return homeService.getURL(url);
	    }

}
