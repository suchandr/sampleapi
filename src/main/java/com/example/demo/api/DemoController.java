package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
	
	@GetMapping("/customers/{customerId}")
	public ResponseEntity<String> getUserById(@PathVariable("customerId") String customerId) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity("http://www.google.com/", String.class);	
	}
}
