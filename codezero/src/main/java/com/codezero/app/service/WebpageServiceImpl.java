package com.codezero.app.service;

import org.springframework.stereotype.Service;

@Service("homeService")
public class WebpageServiceImpl implements WebpageService {

	public String getURL(String url) {
		
		return url;
	}

}
