package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


@RestController
public class CollatzConjectureController {

	
	@GetMapping("/collatz")
	public BigInteger collatzLength(@RequestParam(value="value", defaultValue = "5") int value) {
		return length(value);
	}
 
 
	int collatz(int x){
		if(x%2==0) return x/2;
		return 3*x+1;
	}

	private BigInteger length(int n){
		if(n==1)
			return BigInteger.ONE;
		System.out.print(" "+n);
		return BigInteger.ONE.add(length(collatz(n)));
	}
}
