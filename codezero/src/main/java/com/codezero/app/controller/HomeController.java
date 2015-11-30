package com.codezero.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codezero.app.beans.RailwayStation;
import com.codezero.app.beans.Webpage;
import com.codezero.app.service.RailwayStationServiceImpl;
import com.codezero.app.service.WebpageServiceImpl;

@Controller
@RequestMapping("/home")
public class HomeController {


	@Autowired
    private WebpageServiceImpl webpageService;
	
	@RequestMapping("webPage")
    public @ResponseBody String getWebpage() {
		System.out.println("inside get webpage");
        return webpageService.getWebpage();
    }
	
    @RequestMapping(value = "/addWebpage", method = RequestMethod.POST)
    public @ResponseBody void addWebpage(@RequestBody Webpage webpage) {
    	System.out.println("inside add webpage");
    	webpageService.addWebpage(webpage);
    }
    
    @RequestMapping("/layout")
    public String getHomePartialPage(ModelMap modelMap) {
        return "home/layout";
    }
}


