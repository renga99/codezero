package com.codezero.app.service;

import org.springframework.stereotype.Service;

import com.codezero.app.beans.Webpage;

@Service("WebpageService")
public class WebpageServiceImpl implements WebpageService {

	private static String url;

	public String getWebpage() {
		return url;
	}

	public void addWebpage(Webpage webpage) {
		
		url = webpage.getUrlName();

	}



}
