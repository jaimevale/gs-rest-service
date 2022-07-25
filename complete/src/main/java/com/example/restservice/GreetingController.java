package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;
import java.math.BigInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/factorial")
	public Mono<BigInteger> factorial(@RequestParam(value="value") int value) {
		return fact(value);
	}
 
 
	BigInteger fact(int n){    
	 if (n == 0)    
		 return BigInteger.valueOf(1);    
	 else    
		 return(fact(n-1).multiply(BigInteger.valueOf(n)));    
	 } 
}
