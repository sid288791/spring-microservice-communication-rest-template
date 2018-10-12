package com.helloclient.helloclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/rest/hello/client")
public class HelloResource {
	
	@Autowired
	private RestTemplate restTemplate;

	
	@GetMapping
	public String hello() {
		String url = "http://hello-service/rest/hello/server";
		String response = restTemplate.getForObject(url, String.class);
		return response;
		
		
	}

}
	